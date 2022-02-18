package com.xuancanhit.moneyexchangeapp.respone;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xuancanhit.moneyexchangeapp.models.Exchange;

//This class is for single money request
public class MoneyResponse {
    // 1. Finding Exchange rate for 1 currency / USD
    @SerializedName("result")
    @Expose
    private Exchange exchange;

    public Exchange getExchange(){
        return exchange;
    }

}
