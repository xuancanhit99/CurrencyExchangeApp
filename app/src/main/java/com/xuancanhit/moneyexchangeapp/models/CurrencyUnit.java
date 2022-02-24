package com.xuancanhit.moneyexchangeapp.models;

import java.io.Serializable;

public class CurrencyUnit implements Serializable {


    private int id;
    private String name;
    private Double value;
    private String timeUpdate;

    public CurrencyUnit()  {
    }

    public CurrencyUnit(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public CurrencyUnit(String name, Double value, String timeUpdate) {
        this.name = name;
        this.value = value;
        this.timeUpdate = timeUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    @Override
    public String toString() {
        return "CurrencyUnit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", timeUpdate='" + timeUpdate + '\'' +
                '}';
    }
}
