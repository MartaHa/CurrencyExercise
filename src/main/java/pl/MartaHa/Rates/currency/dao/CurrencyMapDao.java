package pl.MartaHa.Rates.currency.dao;

import pl.MartaHa.Rates.currency.model.Currency;
import pl.MartaHa.Rates.currency.model.CurrencyPair;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class CurrencyMapDao implements CurrencyDao {

    private final Map<CurrencyPair, Double> ratesMap;

    public CurrencyMapDao() {
        ratesMap = new HashMap<>();
    }

    @Override
    public void setRate(CurrencyPair currencyPair, double rate) {
        ratesMap.put(currencyPair, rate);
    }

    @Override
    public double getRate(Currency buy, Currency sell, LocalDate date) {
        return ratesMap.get(new CurrencyPair(buy, sell,date));
    }
}
