import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * Este programa convierte un monto numérico ingresado por el usuario en
 * representaciones de moneda para diferentes países: Estados Unidos, India,
 * China y Francia.
 *
 * Utiliza la clase {NumberFormat} junto con {Locale} para
 * aplicar el formato monetario correspondiente a cada región.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.text.NumberFormat
 * @see java.util.Locale
 */
class CurrencyFormatter{
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //Para Java < 21
        //String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String india = NumberFormat.getCurrencyInstance(Locale.of("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
