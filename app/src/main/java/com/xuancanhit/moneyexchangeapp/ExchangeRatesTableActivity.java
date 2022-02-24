package com.xuancanhit.moneyexchangeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.models.LatestUSD;
import com.xuancanhit.moneyexchangeapp.presentation.model.CurrencyUnitDTO;
import com.xuancanhit.moneyexchangeapp.request.Service;
import com.xuancanhit.moneyexchangeapp.ui.tools.DividerItemDecorator;
import com.xuancanhit.moneyexchangeapp.ui.view.adapters.CurrencyUnitListAdapter;
import com.xuancanhit.moneyexchangeapp.ui.view.viewmodel.CurrencyUnitViewModel;
import com.xuancanhit.moneyexchangeapp.utils.Credentials;
import com.xuancanhit.moneyexchangeapp.utils.ExchangeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExchangeRatesTableActivity extends AppCompatActivity {

    private RecyclerView rvItems;
    private CurrencyUnitListAdapter currencyUnitListAdapter;

    private ImageButton ibUpdate;

    private SwipeRefreshLayout srlReloadTable;

    private EditText edtSearch;


    CurrencyUnitViewModel currencyUnitViewModel;

    ArrayList<CurrencyUnit> currencyU, currencyUSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_rates_table);

        currencyUnitViewModel = new ViewModelProvider(this).get(CurrencyUnitViewModel.class);

        //Search
        edtSearch = findViewById(R.id.edt_search);
        edtSearch.addTextChangedListener(new TextWatcher() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                readData();
                currencyUnitListAdapter.notifyDataSetChanged();
                srlReloadTable.setRefreshing(true);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String textSearch = charSequence.toString();
                FilterData(textSearch);
                srlReloadTable.setRefreshing(false);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        //SwipeRefreshLayout
        srlReloadTable = findViewById(R.id.srl_reload_table);
        srlReloadTable.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onRefresh() {
                readData();
                currencyUnitListAdapter.notifyDataSetChanged();
                srlReloadTable.setRefreshing(false);
            }
        });

        //Circle Button
        ibUpdate = findViewById(R.id.ib_update);
        ibUpdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                UpdateData();
            }
        });

        addControls();
        readData();
    }

    private void readData() {
        currencyU.clear();
        currencyUSearch.clear();

        //Get data All CurrencyUnits to Adapter
        currencyUnitViewModel.getAllCurrencyUnits().observe(this, new Observer<List<CurrencyUnitDTO>>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onChanged(List<CurrencyUnitDTO> currencyUnits) {
                if (currencyUnits != null) {
                    // Data from List(Live data CurrencyUnitDTO from table sqlite in device) just only read
                    // Want cover to CurrencyUnit for show data to View(Adapter using CurrencyUnit) then Update
                    currencyU = new ArrayList<>(Arrays.asList(new CurrencyUnit[currencyUnits.size()]));
                    for (int i = 0; i < currencyUnits.size(); i++) {
                        currencyU.set(i, CurrencyUnitDTO.convertFromCurrencyUnitDTO(currencyUnits.get(i)));
                    }

                    currencyUSearch.addAll(currencyU);
                    currencyUnitListAdapter = new CurrencyUnitListAdapter(getApplicationContext(), currencyU);
                    rvItems.setAdapter(currencyUnitListAdapter);
                }
                currencyUnitListAdapter.notifyDataSetChanged();
            }
        });
    }

    private void addControls() {
        currencyU = new ArrayList<>();
        currencyUSearch = new ArrayList<>();
        rvItems = findViewById(R.id.rv_items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvItems.setLayoutManager(layoutManager);
        rvItems.setHasFixedSize(true);

        //divider for RecycleView(need Class DividerItemDecorator and divider.xml)
        RecyclerView.ItemDecoration dividerItemDecoration = new DividerItemDecorator(ContextCompat.getDrawable(ExchangeRatesTableActivity.this, R.drawable.divider));
        rvItems.addItemDecoration(dividerItemDecoration);

        //Fix E/RecyclerView: No adapter attached; skipping layout
        currencyUnitListAdapter = new CurrencyUnitListAdapter(getApplicationContext(), currencyU); // this
        rvItems.setAdapter(currencyUnitListAdapter);
    }


    //Filter data
    @SuppressLint("NotifyDataSetChanged")
    public void FilterData(String textSearch) {
        textSearch = textSearch.toLowerCase(Locale.getDefault());
        Log.d("filter", textSearch);
        currencyU.clear();
        if (textSearch.length() == 0) {
            currencyU.addAll(currencyUSearch);
            //Log.d("load data", "all");
        } else {
            //Log.d("load data", "filtered");
            for (int i = 0; i < currencyUSearch.size(); i++) {
                if (currencyUSearch.get(i).getName().toLowerCase(Locale.getDefault()).contains(textSearch)) {
                    //Log.d("Tag", currencyU.toString());
                    currencyU.add(currencyUSearch.get(i));
                }
            }
        }
        currencyUnitListAdapter.notifyDataSetChanged();
    }


    private void UpdateData() {

        ExchangeApi exchangeApi = Service.getExchangeApi();
        Call<LatestUSD> responseCall = exchangeApi.updateRateLatestUSD(Credentials.API_KEY);

        responseCall.enqueue(new Callback<LatestUSD>() {

            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<LatestUSD> call, Response<LatestUSD> response) {
                if (response.code() == 200) {
                    LatestUSD latestUSD = response.body();

                    //Time Update
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    currencyU = new ArrayList<>(latestUSD.getConversionRates().getListCurrencies());
                    for (int i = 0; i < currencyU.size(); i++) {
                        //currencies.add(currencyUnits.get(i).getName());
                        currencyUnitViewModel.update(currencyU.get(i).getValue(), dtf.format(now), currencyU.get(i).getName());
                    }
                    Toast.makeText(ExchangeRatesTableActivity.this, "Successfully Updated All Currency Rates From API", Toast.LENGTH_SHORT).show();

                } else if (response.code() == 400) {
                    Toast.makeText(ExchangeRatesTableActivity.this, "Bad Request", Toast.LENGTH_SHORT).show();
                } else if (response.code() == 401) {
                    Toast.makeText(ExchangeRatesTableActivity.this, "Not Authorized", Toast.LENGTH_SHORT).show();
                } else if (response.code() == 403) {
                    Toast.makeText(ExchangeRatesTableActivity.this, "Forbidden", Toast.LENGTH_SHORT).show();
                } else if (response.code() == 404) {
                    Toast.makeText(ExchangeRatesTableActivity.this, "Not Found", Toast.LENGTH_SHORT).show();
                } else if (response.code() == 429) {
                    Toast.makeText(ExchangeRatesTableActivity.this, "Rate limit exceeded", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ExchangeRatesTableActivity.this, "Something went wrong, please try again later", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LatestUSD> call, Throwable t) {
                Toast.makeText(ExchangeRatesTableActivity.this, "Please Check Your Internet Connection", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MoneyExchangeActivity.class));
        finish();
    }

}