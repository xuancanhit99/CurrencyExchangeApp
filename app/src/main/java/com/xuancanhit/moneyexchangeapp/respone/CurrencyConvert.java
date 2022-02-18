package com.xuancanhit.moneyexchangeapp.respone;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.xuancanhit.moneyexchangeapp.models.Results;

public class CurrencyConvert {
    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("result")
    @Expose
    private Results result;
    @SerializedName("ms")
    @Expose
    private Integer ms;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Results getResult() {
        return result;
    }

    public void setResult(Results result) {
        this.result = result;
    }

    public Integer getMs() {
        return ms;
    }

    public void setMs(Integer ms) {
        this.ms = ms;
    }



    @Override
    public String toString() {
        return "CurrencyConvert{" +
                "base='" + base + '\'' +
                ", amount=" + amount +
                ", result=" + result +
                ", ms=" + ms +
                '}';
    }
}
