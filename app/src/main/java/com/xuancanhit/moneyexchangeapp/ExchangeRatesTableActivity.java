package com.xuancanhit.moneyexchangeapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.presentation.model.CurrencyUnitDTO;
import com.xuancanhit.moneyexchangeapp.ui.tools.DividerItemDecorator;
import com.xuancanhit.moneyexchangeapp.ui.view.adapters.CurrencyUnitListAdapter;
import com.xuancanhit.moneyexchangeapp.ui.view.viewmodel.CurrencyUnitViewModel;

import java.util.Arrays;
import java.util.List;

public class ExchangeRatesTableActivity extends AppCompatActivity {

    private RecyclerView rvItems;
    private CurrencyUnitListAdapter currencyUnitListAdapter;

    CurrencyUnitViewModel currencyUnitViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_rates_table);

        currencyUnitViewModel = new ViewModelProvider(this).get(CurrencyUnitViewModel.class);

        addControlsAndReadData();
    }

    private void addControlsAndReadData() {
        rvItems = (RecyclerView) findViewById(R.id.rv_items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvItems.setLayoutManager(layoutManager);
        rvItems.setHasFixedSize(true);

        //divider for RecycleView(need Class DividerItemDecorator and divider.xml)
        RecyclerView.ItemDecoration dividerItemDecoration = new DividerItemDecorator(ContextCompat.getDrawable(ExchangeRatesTableActivity.this, R.drawable.divider));
        rvItems.addItemDecoration(dividerItemDecoration);

        //Get data All CurrencyUnits to Adapter
        currencyUnitViewModel.getAllCurrencyUnits().observe(this, new Observer<List<CurrencyUnitDTO>>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onChanged(List<CurrencyUnitDTO> currencyUnits) {
                if (currencyUnits != null) {
                    // Data from List(Live data CurrencyUnitDTO from table sqlite in device) just only read
                    // Want cover to CurrencyUnit for show data to View(Adapter using CurrencyUnit) then Update
                    List<CurrencyUnit> currencyUnitList = Arrays.asList(new CurrencyUnit[currencyUnits.size()]);
                    for (int i = 0; i < currencyUnits.size(); i++) {
                        currencyUnitList.set(i, CurrencyUnitDTO.convertFromCurrencyUnitDTO(currencyUnits.get(i)));
                    }
                    currencyUnitListAdapter = new CurrencyUnitListAdapter(getApplicationContext(), currencyUnitList);
                    rvItems.setAdapter(currencyUnitListAdapter);
                }
                currencyUnitListAdapter.notifyDataSetChanged();
            }
        });

        //Fix E/RecyclerView: No adapter attached; skipping layout
        currencyUnitListAdapter = new CurrencyUnitListAdapter(getApplicationContext(), null); // this
        rvItems.setAdapter(currencyUnitListAdapter);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MoneyExchangeActivity.class));
        finish();
    }

}