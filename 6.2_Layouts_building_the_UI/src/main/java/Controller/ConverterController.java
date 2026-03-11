package Controller;

import Model.Currency;

import java.util.ArrayList;
import java.util.List;

public class ConverterController {

    private List<Currency> currencies = new ArrayList<>();

    public ConverterController() {

        currencies.add(new Currency("USD", "US Dollar", 1.0));
        currencies.add(new Currency("EUR", "Euro", 0.93));
        currencies.add(new Currency("RUB", "Russian Ruble", 90.0));
        currencies.add(new Currency("CHF", "Swiss Franc", 0.90));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public double convert(double amount, Currency from, Currency to) {

        double usd = amount / from.getRateToUSD();
        return usd * to.getRateToUSD();
    }
}



