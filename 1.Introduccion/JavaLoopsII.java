import java.util.*;
import java.io.*;
/**
 * Este programa lee múltiples casos de prueba y, para cada uno,
 * imprime una secuencia basada en una fórmula matemática con potencias de 2.
 *
 * Entrada:
 *   - Un entero 't' indicando el número de casos de prueba.
 *   - Por cada caso: tres enteros 'a', 'b' y 'n'.
 *
 * Salida:
 *   - Por cada caso, se imprime una secuencia de 'n' números calculados con la fórmula:
 *     a + (2^0 * b), a + (2^0 * b + 2^1 * b), ..., hasta 'n' términos.
 *
 * Autor: Cristopher Escamilla
 * Versión: 1.0
 */
class JavaLoopsII{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       int t=in.nextInt();
       for(int i=0;i<t;i++){
           int a = in.nextInt();
           int b = in.nextInt();
           int n = in.nextInt();
           int temp = a;
           for (int j = 0; j < n; j++) {
             // Math.pow(2, j) calcula 2 eslevado a la potencia j.
             // Es decir, realiza la operación matemática: 2^j
             // - El primer parámetro (2) es la base.
             // - El segundo parámetro (j) es el exponente.
             // El resultado será un valor de tipo double.
              //temp = temp + (int)(Math.pow(2, j) * b);
               temp += (Math.pow(2, j) * b);
               System.out.print(temp + " ");
           }
           System.out.println();
       }
       in.close();
   }
}
