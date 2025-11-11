import java.io.*;
import java.util.*;
/**
 * Este programa lee una serie de números enteros desde la entrada estándar
 * y determina en qué tipos primitivos de Java pueden almacenarse sin pérdida de información.
 *
 * Tipos primitivos considerados:
 * - byte   : 8 bits   → rango [-128, 127]
 * - short  : 16 bits  → rango [-2^15, 2^15 - 1]
 * - int    : 32 bits  → rango [-2^31, 2^31 - 1]
 * - long   : 64 bits  → rango [-2^63, 2^63 - 1]
 *
 * Si un número excede el rango del tipo `long`, el programa captura la excepción
 * y reporta que el número no puede almacenarse en ningún tipo primitivo.
 *
 * Entradas:
 * - Un número entero `t` indicando cuántos números serán evaluados.
 * - Luego `x` líneas, cada una con un número que se intentará almacenar en los tipos primitivos.
 *
 * Salida:
 * - Para cada número válido, se imprime en qué tipos puede almacenarse.
 * - Para cada número inválido (muy grande para `long`), se indica que no puede almacenarse en ningún tipo.
 *
 * Ejemplo de entrada:
 *  3
 *  127
 *  150000
 *  9223372036854775808
 *
 * Ejemplo de salida:
 *  127 can be fitted in:
 *  * byte
 *  * short
 *  * int
 *  * long
 *  150000 can be fitted in:
 *  * short
 *  * int
 *  * long
 *  9223372036854775808 can't be fitted anywhere.
  * @author Cristopher Escamilla
  * @version 1.0
  * @see java.lang.Math
  * @see java.util.Scanner
 */
class JavaDataTypes{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      try
      {
        long x=sc.nextLong();
        System.out.println(x+" can be fitted in:");
        if(x>=-128 && x<=127)System.out.println("* byte");
        if (x >= -(Math.pow(2, 16 - 1)) && x <= (Math.pow(2, 16 - 1) - 1))
        System.out.println("* short");
        if (x >= -(Math.pow(2, 32 - 1)) && x <= (Math.pow(2, 32 - 1) - 1))
        System.out.println("* int");
        if (x >= -(Math.pow(2, 64 - 1)) && x <= (Math.pow(2, 64 - 1) - 1))
        System.out.println("* long");
      }
      catch(Exception e)
      {
        System.out.println(sc.next()+" can't be fitted anywhere.");
      }

    }
  }
}
