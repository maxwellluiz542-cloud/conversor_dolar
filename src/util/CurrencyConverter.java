package util;

public class CurrencyConverter {

        public static double totalAmount(double valorDolar, double quantidade) {

            double total = (valorDolar * quantidade) * 1.06;
            return total;

        }

}
