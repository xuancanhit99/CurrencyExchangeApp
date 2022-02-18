package com.xuancanhit.moneyexchangeapp.utils;

import com.xuancanhit.moneyexchangeapp.respone.CurrencyConvert;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ExchangeApi {

    //Convert
    @GET("convert?")
    Call<CurrencyConvert> convertCurrency(
            @Query("from") String from,
            @Query("to") String to,
            @Query("amount") String amount,
            @Query("api_key") String api_key);
}
