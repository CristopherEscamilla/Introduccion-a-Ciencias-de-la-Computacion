import java.util.Scanner;
/**
 * Este programa convierte un número entero leído desde la entrada estándar
 * en una cadena de texto utilizando el método {String.valueOf(int)}.
 *
 * El número ingresado se almacena en una variable entera y luego se
 * transforma a tipo String, que finalmente se imprime por pantalla.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.lang.String#valueOf(int)
 */
class IntToString{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in .nextInt();
    in.close();

    String s = String.valueOf(n);

    System.out.println(s);
  }
}
