package com.xuancanhit.moneyexchangeapp.presentation.room;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.presentation.model.CurrencyUnitDTO;
import com.xuancanhit.moneyexchangeapp.presentation.room.dao.CurrencyUnitDAO;

import java.util.List;

public class CurrencyUnitRepository {
    private CurrencyUnitDAO mCurrencyUnitDAO;
    private LiveData<List<CurrencyUnitDTO>> mAllCurrencyUnits;

    public CurrencyUnitRepository(Application application) {
        CurrencyUnitRoomDatabase db = CurrencyUnitRoomDatabase.getDatabase(application);
        mCurrencyUnitDAO = db.currencyUnitDao();
        mAllCurrencyUnits = mCurrencyUnitDAO.getAlphabetizedAllCurrencyUnits();
    }

    public LiveData<List<CurrencyUnitDTO>> getAllCurrencyUnits() {
        return mAllCurrencyUnits;
    }

    public void insertCurrencyUnit(CurrencyUnit currencyUnit) {
        CurrencyUnitDTO dto = CurrencyUnitDTO.convertFromCurrencyUnit(currencyUnit);
        CurrencyUnitRoomDatabase.databaseWriteExecutor.execute(() ->
                mCurrencyUnitDAO.insertCurrencyUnit(dto)
        );
    }

    public void updateCurrencyUnit(CurrencyUnit currencyUnit) {
        CurrencyUnitDTO dto = CurrencyUnitDTO.convertFromCurrencyUnit(currencyUnit);
        CurrencyUnitRoomDatabase.databaseWriteExecutor.execute(() ->
                mCurrencyUnitDAO.updateCurrencyUnit(dto));
    }

    public void update(Double value, String timeUpdate, String name) {
        CurrencyUnitRoomDatabase.databaseWriteExecutor.execute(() ->
                mCurrencyUnitDAO.update(value, timeUpdate, name));
    }

    public void deleteCurrencyUnit(CurrencyUnit currencyUnit) {
        CurrencyUnitDTO dto = CurrencyUnitDTO.convertFromCurrencyUnit(currencyUnit);
        CurrencyUnitRoomDatabase.databaseWriteExecutor.execute(() ->
                mCurrencyUnitDAO.deleteCurrencyUnit(dto));
    }
}
