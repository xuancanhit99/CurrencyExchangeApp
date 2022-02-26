package com.xuancanhit.moneyexchangeapp.utils;

import com.xuancanhit.moneyexchangeapp.models.LatestUSD;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ExchangeApi {

    //Rate USD
    @GET("{api_key}/latest/USD")
    Call<LatestUSD> updateRateLatestUSD(
            @Path("api_key") String api_key);

    //Convert
//    @GET("latest/{}")
//    Call<CurrencyConvert> convertCurrency(
//            @Query("from") String from,
//            @Query("to") String to,
//            @Query("amount") String amount,
//            @Query("api_key") String api_key);
}
