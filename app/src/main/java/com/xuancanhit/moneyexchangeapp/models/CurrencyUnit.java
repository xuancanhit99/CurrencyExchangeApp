package com.xuancanhit.moneyexchangeapp.models;

import java.io.Serializable;

public class CurrencyUnit implements Serializable {


    private int id;
    private String name;
    private Double value;

    public CurrencyUnit()  {
    }

    public CurrencyUnit(String name, Double value) {
        this.name = name;
        this.value = value;
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
}
