package com.xuancanhit.moneyexchangeapp.presentation.room.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.xuancanhit.moneyexchangeapp.presentation.model.CurrencyUnitDTO;

import java.util.List;

@Dao
public interface CurrencyUnitDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCurrencyUnit(CurrencyUnitDTO currencyUnit);

    @Update
    void updateCurrencyUnit(CurrencyUnitDTO currencyUnit);

    @Query("UPDATE currency_unit_table SET Value=:value, TimeUpdate=:timeUpdate WHERE Name = :name")
    void update(Double value, String timeUpdate, String name);

    @Delete
    void deleteCurrencyUnit(CurrencyUnitDTO currencyUnit);

    @Query("DELETE FROM currency_unit_table")
    void deleteAllCurrencyUnits();


    @Query("SELECT * FROM currency_unit_table ORDER BY name ASC")
    LiveData<List<CurrencyUnitDTO>> getAlphabetizedAllCurrencyUnits();
}
