package com.xuancanhit.moneyexchangeapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.models.LatestUSD;
import com.xuancanhit.moneyexchangeapp.request.Service;
import com.xuancanhit.moneyexchangeapp.utils.Credentials;
import com.xuancanhit.moneyexchangeapp.utils.ExchangeApi;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoneyExchangeActivity extends AppCompatActivity {

    private Button btnSwap, btnViewExchangeRate, btnReset, btnUpdateData, btnExit;
    private EditText edtYouSend, edtTheyGet;
    private Spinner snYouSend, snTheyGet;

    private List<String> currencies;
    int posN;

    String from, to;
    String theyGet;

    List<CurrencyUnit> currencyUnits;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_exchange);
        initUI();

        //UpdateData();


        snYouSend.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String pos = String.valueOf(i);
                posN = Integer.parseInt(pos);
                //
                from = currencies.get(posN);
                if (edtYouSend.getText().toString().equals("")) {
                    edtTheyGet.setText("");
                } else {
                    DoConvertAndShowResult(from, to, Double.parseDouble(edtYouSend.getText().toString()));

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        snTheyGet.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String pos = String.valueOf(i);
                posN = Integer.parseInt(pos);
                to = currencies.get(posN);
                if (edtYouSend.getText().toString().equals("")) {
                    edtTheyGet.setText("");
                } else {
                    DoConvertAndShowResult(from, to, Double.parseDouble(edtYouSend.getText().toString()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // Button Swap
        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Swap();
                if (edtYouSend.getText().toString().equals("")) {
                    edtTheyGet.setText("");
                } else {
                    DoConvertAndShowResult(from, to, Double.parseDouble(edtYouSend.getText().toString()));

                }
            }
        });

        //Edit Text You Send
        edtYouSend.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //edtTheyGet.setText("");

                if (edtYouSend.getText().toString().equals("")) {
                    edtTheyGet.setText("");
                } else {
                    DoConvertAndShowResult(from, to, Double.parseDouble(edtYouSend.getText().toString()));

                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        // Button Reset
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Button Exit
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // Button UPDATE DATA
        btnUpdateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UpdateData();
            }
        });

    }

    private void DoConvertAndShowResult(String from, String to, Double amount) {
        Double rateUSDTo = 1.0;
        Double rateUSDFrom = 1.0;
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);

        for (int i = 0; i < currencyUnits.size(); i++) {
            if (currencyUnits.get(i).getName().equals(to))
                rateUSDTo = currencyUnits.get(i).getValue();
        }


        if (from.equals("USD")) {
            theyGet = df.format(Math.round( (amount * rateUSDTo) * 100.0) / 100.0);
        }
        else {
            for (int i = 0; i < currencyUnits.size(); i++) {
                if (currencyUnits.get(i).getName().equals(from))
                    rateUSDFrom = currencyUnits.get(i).getValue();
            }
            Double rateToFrom = rateUSDTo/rateUSDFrom;
            theyGet = df.format(Math.round(amount * rateToFrom * 100.0) / 100.0);
        }


        edtTheyGet.setText(theyGet);
    }

    private void Swap() {
        String temp = from;
        from = to;
        to = temp;

        int spinnerPositionYouSend = adapter.getPosition(from);
        snYouSend.setSelection(spinnerPositionYouSend);

        int spinnerPositionTheyGet = adapter.getPosition(to);
        snTheyGet.setSelection(spinnerPositionTheyGet);

        if (edtYouSend.getText().toString().equals(""))
            edtTheyGet.setText("");
    }


    private void adapterSpinner() {
        adapter = new ArrayAdapter<String>(MoneyExchangeActivity.this, android.R.layout.simple_spinner_item, currencies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        snYouSend.setAdapter(adapter);
        snTheyGet.setAdapter(adapter);

        String defaultCurrencyYouSend = "USD";
//        ArrayAdapter arrayAdapter = (ArrayAdapter) snTheyGet.getAdapter();
//        int spinnerPosition = arrayAdapter.getPosition(defaultCurrency);
        int spinnerPositionYouSend = adapter.getPosition(defaultCurrencyYouSend);
        snYouSend.setSelection(spinnerPositionYouSend);

        String defaultCurrencyTheyGet = "RUB";
        int spinnerPositionTheyGet = adapter.getPosition(defaultCurrencyTheyGet);
        snTheyGet.setSelection(spinnerPositionTheyGet);
    }


    private void UpdateData() {
        ExchangeApi exchangeApi = Service.getExchangeApi();
        Call<LatestUSD> responseCall = exchangeApi.updateRateLatestUSD(Credentials.API_KEY);

        responseCall.enqueue(new Callback<LatestUSD>() {
            @Override
            public void onResponse(Call<LatestUSD> call, Response<LatestUSD> response) {
                if (response.code() == 200) {
                    LatestUSD latestUSD = response.body();

                    currencyUnits = latestUSD.getConversionRates().getListCurrencies();
                    currencies = new ArrayList<>();
                    for (int i = 0; i < currencyUnits.size(); i++) {
                        currencies.add(currencyUnits.get(i).getName());
                        //Log.v("Tag", currencyUnits.get(i).getName() + " = " + currencyUnits.get(i).getValue() + ", ");
                    }

                    adapterSpinner();
                }
            }

            @Override
            public void onFailure(Call<LatestUSD> call, Throwable t) {
                Log.e("Tag", "Err");
            }
        });
    }


    private void initUI() {
        btnSwap = findViewById(R.id.btn_swap);
        btnViewExchangeRate = findViewById(R.id.btn_view_exchange_rate);
        btnReset = findViewById(R.id.btn_reset);
        btnUpdateData = findViewById(R.id.btn_update_data);
        btnExit = findViewById(R.id.btn_exit);

        edtYouSend = findViewById(R.id.edt_you_send);
        edtTheyGet = findViewById(R.id.edt_they_get);

        snYouSend = findViewById(R.id.sn_you_send);
        snTheyGet = findViewById(R.id.sn_they_get);
    }
}