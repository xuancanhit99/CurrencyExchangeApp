package com.xuancanhit.moneyexchangeapp.presentation.room;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.xuancanhit.moneyexchangeapp.presentation.model.CurrencyUnitDTO;
import com.xuancanhit.moneyexchangeapp.presentation.room.dao.CurrencyUnitDAO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {CurrencyUnitDTO.class}, version = 1, exportSchema = false)
public abstract class CurrencyUnitRoomDatabase extends RoomDatabase {
    public abstract CurrencyUnitDAO currencyUnitDao();
    private static volatile CurrencyUnitRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static CurrencyUnitRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (CurrencyUnitRoomDatabase.class) {
                if (INSTANCE == null) {

                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            CurrencyUnitRoomDatabase.class, "currency_unit_database.db")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }



    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                CurrencyUnitDAO dao = INSTANCE.currencyUnitDao();
                dao.deleteAllCurrencyUnits();
                CurrencyUnitDTO currencyUnit = new CurrencyUnitDTO("AED", 0.0, dtf.format(now));
                dao.insertCurrencyUnit(currencyUnit);

                currencyUnit = new CurrencyUnitDTO("AFN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ALL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("AMD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ANG", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("AOA", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ARS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("AUD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("AWG", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("AZN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BAM", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BBD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BDT", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BGN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BHD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BIF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BMD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BND", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BOB", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BRL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BSD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BTN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BWP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BYN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("BZD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CAD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CDF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CHF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CLP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CNY", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("COP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CRC", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CUP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CVE", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("CZK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("DJF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("DKK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("DOP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("DZD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("EGP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ERN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ETB", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("EUR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("FJD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("FKP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("FOK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GBP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GEL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GGP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GHS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GIP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GMD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GNF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GTQ", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("GYD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("HKD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("HNL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("HRK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("HTG", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("HUF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("IDR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ILS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("IMP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("INR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("IQD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("IRR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ISK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("JEP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("JMD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("JOD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("JPY", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KES", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KGS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KHR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KID", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KMF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KRW", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KWD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KYD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("KZT", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("LAK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("LBP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("LKR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("LRD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("LSL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("LYD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MAD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MDL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MGA", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MKD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MMK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MNT", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MOP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MRU", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MUR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MVR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MWK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MXN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MYR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("MZN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("NAD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("NGN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("NIO", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("NOK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("NPR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("NZD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("OMR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PAB", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PEN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PGK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PHP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PKR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PLN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("PYG", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("QAR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("RON", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("RSD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("RUB", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("RWF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SAR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SBD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SCR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SDG", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SEK", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SGD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SHP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SLL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SOS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SRD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SSP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("STN", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SYP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("SZL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("THB", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TJS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TMT", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TND", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TOP", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TRY", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TTD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TVD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TWD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("TZS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("UAH", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("UGX", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("USD", 1.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("UYU", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("UZS", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("VES", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("VND", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("VUV", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("WST", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("XAF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("XCD", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("XDR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("XOF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("XPF", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("YER", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ZAR", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ZMW", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
                currencyUnit = new CurrencyUnitDTO("ZWL", 0.0, dtf.format(now)); dao.insertCurrencyUnit(currencyUnit);
            });
        }
    };
}
