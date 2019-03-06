package pl.MartaHa.Rates;

import pl.MartaHa.Rates.currency.dao.CurrencyMapDao;
import pl.MartaHa.Rates.currency.model.Currency;
import pl.MartaHa.Rates.currency.model.CurrencyPair;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency");
        Currency currency1 = Currency.valueOf(scanner.next());
        System.out.println("Enter second currency");
        Currency currency2 = Currency.valueOf(scanner.next());
        System.out.println("Enter buyrate");
        int rate = scanner.nextInt();
        LocalDate date = LocalDate.now();

        CurrencyMapDao currencyMapDao = new CurrencyMapDao();
        currencyMapDao.setRate(new CurrencyPair(currency1,currency2,date),rate);

        System.out.println(currencyMapDao.getRate(currency1,currency2, date));

    }
}
