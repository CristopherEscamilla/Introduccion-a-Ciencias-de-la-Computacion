import java.util.Scanner;
/**
 * Este programa lee tres tipos de datos desde la entrada estándar:
 * un entero, un número decimal (double) y una línea de texto (String).
 * Luego imprime los valores en orden inverso: String, Double, Int.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.util.Scanner
 */

class JavaStdinStdoutII {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int i = scan.nextInt();
      // Escanea el siguiente elemento de la entrada como un número
      // decimal (tipo double)
      double d = scan.nextDouble();
      // nextLine()Escanea el siguiente elemento (o palabra) de la entrada como un número decimal (tipo double)
      // Avanza este escáner más allá de la línea actual y
      // devuelve la entrada que fue omitida.
      scan.nextLine();
      String s = scan.nextLine();

      System.out.println("String: " + s);
      System.out.println("Double: " + d);
      System.out.println("Int: " + i);
  }
}
