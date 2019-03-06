package pl.MartaHa.Rates.currency.dao;

import pl.MartaHa.Rates.currency.model.Currency;
import pl.MartaHa.Rates.currency.model.CurrencyPair;

import java.time.LocalDate;

public interface CurrencyDao {

    public void setRate(CurrencyPair currencyPair, double rate);

    public double getRate (Currency buy, Currency sell, LocalDate date);
}
