package com.xuancanhit.moneyexchangeapp.presentation.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;

@Entity(tableName = "currency_unit_table")
public class CurrencyUnitDTO extends CurrencyUnit {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    private int id;

    @ColumnInfo(name = "Name")
    private String name;

    @ColumnInfo(name = "Value")
    private Double value;

    @ColumnInfo(name = "TimeUpdate")
    private String timeUpdate;

    public CurrencyUnitDTO() {}

    @Ignore
    public CurrencyUnitDTO(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public CurrencyUnitDTO(String name, Double value, String timeUpdate) {
        this.name = name;
        this.value = value;
        this.timeUpdate = timeUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String getTimeUpdate() {
        return timeUpdate;
    }

    @Override
    public void setTimeUpdate(String timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public static CurrencyUnitDTO convertFromCurrencyUnit(CurrencyUnit currencyUnit){
        CurrencyUnitDTO dto = new CurrencyUnitDTO();
        dto.setId(currencyUnit.getId());
        dto.setName(currencyUnit.getName());
        dto.setValue(currencyUnit.getValue());
        dto.setTimeUpdate(currencyUnit.getTimeUpdate());
        return dto;
    }

    public static CurrencyUnit convertFromCurrencyUnitDTO(CurrencyUnitDTO currencyUnit){
        CurrencyUnit cur = new CurrencyUnit();
        cur.setId(currencyUnit.getId());
        cur.setName(currencyUnit.getName());
        cur.setValue(currencyUnit.getValue());
        cur.setTimeUpdate(currencyUnit.getTimeUpdate());
        return cur;
    }
}
