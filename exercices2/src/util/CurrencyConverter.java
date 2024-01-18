
package util;

public class CurrencyConverter {
    public static final double IOS = 0.06;

    public static double converter(double price, double quantities) {
        return quantities * price;
    }

    public static double taxa(double price, double quantities) {
        return converter(price, quantities) * (1+IOS);
    }
}

