package com.xuancanhit.moneyexchangeapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LatestUSD {
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("documentation")
    @Expose
    private String documentation;
    @SerializedName("terms_of_use")
    @Expose
    private String termsOfUse;
    @SerializedName("time_last_update_unix")
    @Expose
    private Integer timeLastUpdateUnix;
    @SerializedName("time_last_update_utc")
    @Expose
    private String timeLastUpdateUtc;
    @SerializedName("time_next_update_unix")
    @Expose
    private Integer timeNextUpdateUnix;
    @SerializedName("time_next_update_utc")
    @Expose
    private String timeNextUpdateUtc;
    @SerializedName("base_code")
    @Expose
    private String baseCode;
    @SerializedName("conversion_rates")
    @Expose
    private ConversionRates conversionRates;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getTermsOfUse() {
        return termsOfUse;
    }

    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public Integer getTimeLastUpdateUnix() {
        return timeLastUpdateUnix;
    }

    public void setTimeLastUpdateUnix(Integer timeLastUpdateUnix) {
        this.timeLastUpdateUnix = timeLastUpdateUnix;
    }

    public String getTimeLastUpdateUtc() {
        return timeLastUpdateUtc;
    }

    public void setTimeLastUpdateUtc(String timeLastUpdateUtc) {
        this.timeLastUpdateUtc = timeLastUpdateUtc;
    }

    public Integer getTimeNextUpdateUnix() {
        return timeNextUpdateUnix;
    }

    public void setTimeNextUpdateUnix(Integer timeNextUpdateUnix) {
        this.timeNextUpdateUnix = timeNextUpdateUnix;
    }

    public String getTimeNextUpdateUtc() {
        return timeNextUpdateUtc;
    }

    public void setTimeNextUpdateUtc(String timeNextUpdateUtc) {
        this.timeNextUpdateUtc = timeNextUpdateUtc;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public ConversionRates getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(ConversionRates conversionRates) {
        this.conversionRates = conversionRates;
    }
}
