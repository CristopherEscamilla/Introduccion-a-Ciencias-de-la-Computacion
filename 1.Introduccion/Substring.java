import java.util.*;
/**
 * Este programa recibe una cadena de texto y dos índices, start y end,
 * e imprime la subcadena que comienza en la posición start y termina en la posición end - 1.
 *
 * Utiliza el método {substring()} de la clase {String} para extraer
 * todos los caracteres del rango indicado (inclusive start, exclusivo end).
 *
 * Formato de entrada:
 *
 *   La primera línea contiene una cadena de caracteres {S}.
 *   La segunda línea contiene dos enteros separados por espacio: {start} y {@end}.
 *
 *
 * Restricciones:
 *
 *   1 ≤ |S| ≤ 100
 *   0 ≤ start &lt; end ≤ |S|
 *   S solo contiene letras del alfabeto inglés (a–z, A–Z).
 *
 *
 * Formato de salida:
 * Imprime la subcadena en el rango de índice {start} a {end - 1}.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.lang.String#substring(int, int)
 * @see java.util.Scanner
 */
class Substring{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();

    String res = S.substring(start,end);
    System.out.println(res);
  }
}
