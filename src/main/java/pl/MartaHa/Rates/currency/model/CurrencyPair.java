package pl.MartaHa.Rates.currency.model;

import java.time.LocalDate;
import java.util.Objects;

public class CurrencyPair {

    private final Currency sell;
    private final Currency buy;
    private final LocalDate date;

    public CurrencyPair(Currency sell, Currency buy, LocalDate date) {
        this.sell = sell;
        this.buy = buy;
        this.date = date;
    }

    public Currency getSell() {
        return sell;
    }

    public Currency getBuy() {
        return buy;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyPair that = (CurrencyPair) o;
        return sell == that.sell &&
                buy == that.buy &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sell, buy, date);
    }
}
