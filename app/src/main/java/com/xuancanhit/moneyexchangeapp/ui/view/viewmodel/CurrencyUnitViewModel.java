package com.xuancanhit.moneyexchangeapp.ui.view.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.xuancanhit.moneyexchangeapp.models.CurrencyUnit;
import com.xuancanhit.moneyexchangeapp.presentation.model.CurrencyUnitDTO;
import com.xuancanhit.moneyexchangeapp.presentation.room.CurrencyUnitRepository;

import java.util.List;

public class CurrencyUnitViewModel extends AndroidViewModel {
    private CurrencyUnitRepository mCurrencyUnitRepository;
    private final LiveData<List<CurrencyUnitDTO>> mAllCurrencyUnits;

    public CurrencyUnitViewModel(Application application) {
        super(application);
        mCurrencyUnitRepository = new CurrencyUnitRepository(application);
        mAllCurrencyUnits = mCurrencyUnitRepository.getAllCurrencyUnits();
    }

    public LiveData<List<CurrencyUnitDTO>> getAllCurrencyUnits() {
        return mAllCurrencyUnits;
    }

    public void insertCurrencyUnit(CurrencyUnit currencyUnit) {
        mCurrencyUnitRepository.insertCurrencyUnit(currencyUnit);
    }

    public void updateCurrencyUnit(CurrencyUnit currencyUnit) {
        mCurrencyUnitRepository.updateCurrencyUnit(currencyUnit);
    }

    public void update(Double value, String timeUpdate, String name) {
        mCurrencyUnitRepository.update(value, timeUpdate, name);
    }


    public void deleteCurrencyUnit(CurrencyUnit currencyUnit) {
        mCurrencyUnitRepository.deleteCurrencyUnit(currencyUnit);
    }
}
