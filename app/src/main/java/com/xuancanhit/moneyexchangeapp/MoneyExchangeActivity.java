package com.xuancanhit.moneyexchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.xuancanhit.moneyexchangeapp.request.Service;
import com.xuancanhit.moneyexchangeapp.respone.CurrencyConvert;
import com.xuancanhit.moneyexchangeapp.utils.Credentials;
import com.xuancanhit.moneyexchangeapp.utils.ExchangeApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_exchange);
        initUI();

        // Currencies
        currencies = Arrays.asList("AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM",
                "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BZD", "CAD",
                "CDF", "CHF", "CLF", "CLP", "CNH", "CNY", "COP", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD",
                "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD",
                "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD", "IRR", "ISK", "JMD", "JOD", "JPY",
                "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL",
                "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR",
                "MZN", "NAD", "NGN", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG",
                "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD",
                "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD",
                "UYU", "UZS", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, currencies);

        // Spinner
        adapterSpinner();
        snYouSend.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String pos = String.valueOf(i);
                posN = Integer.parseInt(pos);
                //
                from = currencies.get(posN);
                //Toast.makeText(MoneyExchangeActivity.this, currencies.get(posN), Toast.LENGTH_LONG).show();
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
            }
        });

        //Edit Text You Send
        edtYouSend.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                edtTheyGet.setText("");

                if(edtYouSend.getText().toString().equals("")){
                    edtTheyGet.setText("");
                }
                GetCurrencyConvertResponse(from, to, edtYouSend.getText().toString());
//                edtTheyGet.setText(theyGet);
//                Toast.makeText(MoneyExchangeActivity.this, theyGet, Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        // Button Reset
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //GetCurrencyConvertResponse();
            }
        });

        // Button Exit
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void Swap() {
        String temp = from;
        from = to;
        to = temp;

        int spinnerPositionYouSend = adapter.getPosition(from);
        snYouSend.setSelection(spinnerPositionYouSend);

        int spinnerPositionTheyGet = adapter.getPosition(to);
        snTheyGet.setSelection(spinnerPositionTheyGet);

        if(edtYouSend.getText().toString().equals(""))
            edtTheyGet.setText("");
        GetCurrencyConvertResponse(from, to, edtYouSend.getText().toString());
    }


    private void adapterSpinner() {
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

    private void GetCurrencyConvertResponse(String from, String to, String amount) {
        ExchangeApi exchangeApi = Service.getExchangeApi();
        Call<CurrencyConvert> responseCall = exchangeApi.convertCurrency(from, to, amount, Credentials.API_KEY);

        responseCall.enqueue(new Callback<CurrencyConvert>() {
            @Override
            public void onResponse(Call<CurrencyConvert> call, Response<CurrencyConvert> response) {
                if (response.code() == 200) {
                    //Log.v("Tag", "The response" + response.body().toString());

                    CurrencyConvert currencyConvert = response.body();
                    theyGet = String.valueOf(currencyConvert.getResult().getResultTheyGet());
                    edtTheyGet.setText(theyGet);
                    //Toast.makeText(MoneyExchangeActivity.this, theyGet, Toast.LENGTH_LONG).show();
                    //Log.v("Tag", "The result" + currencyConvert.getResult());
                }
            }

            @Override
            public void onFailure(Call<CurrencyConvert> call, Throwable t) {
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