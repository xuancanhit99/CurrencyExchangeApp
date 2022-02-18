package com.xuancanhit.moneyexchangeapp.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exchange {

    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("result")
    @Expose
    private Results result;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("ms")
    @Expose
    private Integer ms;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Results getResult() {
        return result;
    }

    public void setResult(Results result) {
        this.result = result;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getMs() {
        return ms;
    }

    public void setMs(Integer ms) {
        this.ms = ms;
    }

}