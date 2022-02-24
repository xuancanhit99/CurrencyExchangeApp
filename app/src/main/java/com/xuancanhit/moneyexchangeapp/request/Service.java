package com.xuancanhit.moneyexchangeapp.request;

import com.xuancanhit.moneyexchangeapp.utils.Credentials;
import com.xuancanhit.moneyexchangeapp.utils.ExchangeApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Service {
    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
            .baseUrl(Credentials.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());
    private static Retrofit retrofit = retrofitBuilder.build();

    private static ExchangeApi exchangeApi = retrofit.create(ExchangeApi.class);

    public static ExchangeApi getExchangeApi() {
        return exchangeApi;
    }
}
