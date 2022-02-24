package com.xuancanhit.moneyexchangeapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.models.LatestUSD;
import com.xuancanhit.moneyexchangeapp.request.Service;
import com.xuancanhit.moneyexchangeapp.ui.view.viewmodel.CurrencyUnitViewModel;
import com.xuancanhit.moneyexchangeapp.utils.Credentials;
import com.xuancanhit.moneyexchangeapp.utils.ExchangeApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyUnitUpdateDataActivity extends AppCompatActivity {

    private Button btnReset, btnUpdateData, btnExit;
    private TextView tvUSDRateCurrent, tvUSDRateLatest, tvCurrencyUnit;


    List<CurrencyUnit> currencyUnitsCurrent, currencyUnitsLatest;
    CurrencyUnit currency;

    CurrencyUnitViewModel currencyUnitViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_unit_update_data);

        currencyUnitViewModel = new ViewModelProvider(this).get(CurrencyUnitViewModel.class);

        //Get data from key RATE_DATA push to currency
        Intent intent = getIntent();
        currency = (CurrencyUnit) intent.getSerializableExtra("RATE_DATA");


        initUI();

        //Get data from currency and push to View
        pushDataToView(currency);


        btnUpdateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetDataFromAPI();

            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CurrencyUnitUpdateDataActivity.this, ExchangeRatesTableActivity.class));
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!currency.getName().equals("USD")) {
                    tvUSDRateLatest.setText("0");
                    currency.setValue(0.0);
                    currencyUnitViewModel.updateCurrencyUnit(currency);
                }
                else
                    tvUSDRateLatest.setText("1.0");
                Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Successfully Reset Current Currency Rate: " + currency.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void pushDataToView(CurrencyUnit currency) {
        tvCurrencyUnit.setText(currency.getName());
        tvUSDRateCurrent.setText(String.valueOf(currency.getValue()));
    }

    private void GetDataFromAPI() {
        ExchangeApi exchangeApi = Service.getExchangeApi();
        Call<LatestUSD> responseCall = exchangeApi.updateRateLatestUSD(Credentials.API_KEY);

        responseCall.enqueue(new Callback<LatestUSD>() {
            @Override
            public void onResponse(Call<LatestUSD> call, Response<LatestUSD> response) {
                if (response.code() == 200) {
                    LatestUSD latestUSD = response.body();

                    currencyUnitsLatest = latestUSD.getConversionRates().getListCurrencies();
                    UpdateData(currency);
                }
            }

            @Override
            public void onFailure(Call<LatestUSD> call, Throwable t) {
                Log.e("Tag", "Err");
            }
        });
    }

    private void UpdateData(CurrencyUnit currencyUnit) {

        Double rateUSD = 0.0;
        for (int i = 0; i < currencyUnitsLatest.size(); i++) {
            if (currencyUnitsLatest.get(i).getName().equals(currencyUnit.getName())) {
                rateUSD = currencyUnitsLatest.get(i).getValue();
                tvUSDRateLatest.setText(String.valueOf(rateUSD));
            }
        }

        currencyUnit.setValue(rateUSD);
        currencyUnitViewModel.updateCurrencyUnit(currencyUnit);
        Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Successfully Updated The Latest Currency Rate From API:\n" + currencyUnit.getName() + "= " + currencyUnit.getValue(), Toast.LENGTH_SHORT).show();


//        startActivity(new Intent(this, ExchangeRatesTableActivity.class));
//        finish();

    }


    private void initUI() {

        btnReset = findViewById(R.id.btn_currency_unit_update_data_reset);
        btnUpdateData = findViewById(R.id.btn_currency_unit_update_data);
        btnExit = findViewById(R.id.btn_currency_unit_update_data_exit);

        tvUSDRateCurrent = findViewById(R.id.tv_currency_unit_update_current_rate);
        tvUSDRateLatest = findViewById(R.id.tv_currency_unit_update_latest_rate);
        tvCurrencyUnit = findViewById(R.id.tv_currency_unit_update);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, ExchangeRatesTableActivity.class));
        finish();
    }
}