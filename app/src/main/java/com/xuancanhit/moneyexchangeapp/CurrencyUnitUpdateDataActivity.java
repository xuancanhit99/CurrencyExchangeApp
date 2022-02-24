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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyUnitUpdateDataActivity extends AppCompatActivity {

    private Button btnReset, btnUpdateData, btnExit;
    private TextView tvUSDRateCurrent, tvUSDRateLatest, tvCurrencyUnit, tvTimeUpdateCurrent, tvTimeUpdateLatest;


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
                //Time Update
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                if(!currency.getName().equals("USD")) {
                    tvUSDRateLatest.setText("0.0");
                    currency.setValue(0.0);
                }
                else {
                    tvUSDRateLatest.setText("1.0");
                    currency.setValue(1.0);
                }
                tvTimeUpdateLatest.setText(dtf.format(now));
                currency.setTimeUpdate(dtf.format(now));
                currencyUnitViewModel.updateCurrencyUnit(currency);

                Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Successfully Reset Current Currency Rate: " + currency.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void pushDataToView(CurrencyUnit currency) {
        tvCurrencyUnit.setText(currency.getName());
        tvUSDRateCurrent.setText(String.valueOf(currency.getValue()));
        tvTimeUpdateCurrent.setText(currency.getTimeUpdate());
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
                else if(response.code() == 401){
                    Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Not Authorized", Toast.LENGTH_SHORT).show();
                }
                else if(response.code() == 403){
                    Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Forbidden", Toast.LENGTH_SHORT).show();
                }
                else if(response.code() == 404){
                    Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Not Found", Toast.LENGTH_SHORT).show();
                }
                else if(response.code() == 429){
                    Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Rate limit exceeded", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Something went wrong, please try again later", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LatestUSD> call, Throwable t) {
                Toast.makeText(CurrencyUnitUpdateDataActivity.this, "Please Check Your Internet Connection", Toast.LENGTH_SHORT).show();
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

        //Time Update
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        currencyUnit.setTimeUpdate(dtf.format(now));
        tvTimeUpdateLatest.setText(dtf.format(now));

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
        tvTimeUpdateCurrent = findViewById(R.id.tv_currency_unit_update_current_time);
        tvTimeUpdateLatest = findViewById(R.id.tv_currency_unit_update_latest_time);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, ExchangeRatesTableActivity.class));
        finish();
    }
}