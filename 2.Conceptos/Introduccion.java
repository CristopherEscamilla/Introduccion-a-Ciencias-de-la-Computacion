import java.io.*;
import java.util.Scanner;

/**
 * Introduccion
 * Un programa usado para repasar los conceptos base de la POO.
 *
 * @author Cristopher Alejandro Escamilla Soto
 * @version 1.0
 * @since 2025-08-21
 */
public class Introduccion{

  public static void println(String s) {
       System.out.println(s);
   }

  public static void esperarEnter(Scanner scanner) {
      System.out.print("\nPresiona ENTER para volver al menú...");
      scanner.nextLine();
  }
  //Metodo main 
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Boolean flag = true;

      //Definicion de Algoritmo
      String defAlgoritmo = "Especificacion de los datos y la descripcion de los"
                            + " pasos que deben seguirse para resolver un problema \n"
                            + "Cada paso esta definido sin ambiguedad y al ejecutarse"
                            + " en el orden especifico se obtiene siempre el mismo resultado";
      //Ciclo de desarrollo
      String defDev = "Especificacion \n"
                      + "Diseno \n"
                      + "Implementacion\n"
                      + "Mantenimineto\n";

      //Definicion de Objeto
      String defObj = "Cualquier cosa con significado para el problema que se trata de resolver"
                    + "\n un objeto consta de: "
                    + "\n Estructura :"
                    + "Formada por los atributos que describen a los objetos"
                    + "\n Comportamiento :"
                    + "Definido por el comportamiento que es capaz de realizar el objeto"
                    + "\n Identidad :"
                    + "Identifica el objeto de otros que tienen la misma estructura y comportamiento"
                    + "\n La identidad de cada objeto es unica y no depende de la clase \n"
                    + "Todos los objetos son ejemplares o instancias de una clase";

      //Definicion de Estado
      String defEstado = "El conjunto de valores asociados a cada atributo de la estructura"
                      +" de un objeto en un momento dado";
      //Definicion de Biblioteca
      String defLib = "Es un conjunto de clases e interfaes que se presentan compiladas al programador";
      //Definicion de Compilador
      String defCom = "Un compilador es un programa que tiene dos funciones :"
                  +"\n Verificar que el programa siga las reglas de sintaxis del lenguaje de programacion"
                  +"\n Traducir el programa original a uno equivalente en un lenguaje entendible para la computadora"
                  +"\n Errores de ligado \n"
                  +"\n Errores logicos \n"
                  +"\n Errores de ejecucion \n";

      while (flag) {
          println("\n========= MENÚ =========");
          println("1. Algoritmo");
          println("2. Ciclo de Desarrollo");
          println("3. Objeto");
          println("4. Estado");
          println("5. Biblioteca");
          println("6. Compilador");
          println("7. Salir");
          println("Selecciona una opción: ");

          int opcion = scanner.nextInt();
          scanner.nextLine();

          switch (opcion) {
                  case 1:
                      println(defAlgoritmo);
                      esperarEnter(scanner);
                      break;
                  case 2:
                      println(defDev);
                      esperarEnter(scanner);
                      break;
                  case 3:
                      println(defObj);
                      esperarEnter(scanner);
                      break;
                  case 4:
                      println(defEstado);
                      esperarEnter(scanner);
                      break;
                  case 5:
                      println(defLib);
                      esperarEnter(scanner);
                      break;
                  case 6:
                      println(defCom);
                      esperarEnter(scanner);
                      break;
                  case 7:
                      System.out.println("Saliendo del programa. ¡Hasta luego!");
                      flag = false;
                      break;
                  default:
                      System.out.println("Opción inválida. Intenta de nuevo.");
          }

  }
}
}
