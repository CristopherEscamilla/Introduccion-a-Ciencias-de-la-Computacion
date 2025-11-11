/**
* Importa todas las clases del paquete java.util en este archivo.
* El asterisco * significa que estás importando todas
* las clases del paquete java.util, como:
- Scanner → para leer datos desde el teclado
- ArrayList → listas dinámicas
- HashMap → estructuras tipo diccionario
- Date, Calendar, Random, etc.
*/
import java.util.*;
/**
 * Este programa es parte del curso de Introducción de HackerRank.
 * Lee tres números enteros desde la entrada estándar y los imprime en pantalla.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.util.Scanner
 */

class JavaStdinStdout{
  public static void main(String[] args) {
    /**
    * La clase Scanner
    * Es un escáner de texto simple que puede analizar tipos primitivos
    * y cadenas usando expresiones regulares.
    */
    Scanner scan = new Scanner(System.in);
        // nextInt();
        // Escanea el siguiente token de la entrada como un int.
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
  }
}
