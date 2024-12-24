package poo.statiic;

public class CurrencyConverter {
    public static final double IOFTax = 0.06;

    public static double convertDollarsToReais(double dollarsToBeBought, double currentDollarPrice) {
        double priceInReais = dollarsToBeBought * currentDollarPrice;
        double taxPrice = priceInReais * IOFTax;

        return priceInReais + taxPrice;
    }
}
