
package application;

import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[]args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("CONVERÇÁO DE DOLAR PARA REAL");

            System.out.println("QUAL O PREÇO DO DOLAR? ");
            double valorDolar = sc.nextDouble();

            System.out.println("QUANTOS DOLARES VOÇÊ VAI TROCAR? ");
            double quantidade = sc.nextDouble();

            double total = CurrencyConverter.totalAmount(valorDolar, quantidade);
            System.out.printf("VALOR TOTAL EM REAIS = %.2f%n", total);

        }

}
