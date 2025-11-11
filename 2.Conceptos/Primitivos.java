import java.io.*;
import java.util.Scanner;

/**
 * Primitivos
 * Un programa usado para repasar los conceptos base de la POO.
 *
 * @author Cristopher Alejandro Escamilla Soto
 * @version 1.0
 * @since 2025-08-21
 */
 public class Primitivos{

   public static void esperarEnter(Scanner scanner) {
     System.out.print("\nPresiona ENTER para volver al menú...");
     scanner.nextLine();
   }
   public static void println(String s) {
        System.out.println(s);
    }
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Boolean flag = true;
     byte verdad = 126;

     //Definicion de Identificador
     String identificador = "Se construye como una sucesion de caracteres alfanumericos"
     +" inician con letra o con un ( _ ) "
     +"\n Puede estar formado por varias palabras; si es el caso NO se deben"
     +" incluir espacios en blanco y apartir de la segunda palabra cada una empieza"
     +" con letra mayuscukla (identificadorUno)";

    //Definicion de palabra reservada
     String palabraRes ="Tienen un significado especial para Java";

     //Tipos de datos primitivos
     String primitivos ="Los tipos de dato primitivos son:"
     +"\n Tipo numerico (Enteros o Reales)"
     +"\n Tipo caracter"
     +"\n Tipo Booleano"
     +"\n Los objetos son un tipo de dato mas importante";

     //Definicion de referencia
     String referencia = "Contiene la direccion en memoria, donde se encuentra el objeto con el que se quiere trabajar"
     + ", no contie al objeto en si "
     + "\n En todo programa es necesario especificar de antemano los datos con os que se va a trabajar"
     + ", para que el compilador reserve espacio para cada uno de ellos y para que se puedan manipular en"
     + " el programa";
     //Variables
     String variables = "Se declaran escribiendo el tipo de dato seguido de su identificador y al final ; "
     + "\n Si hay mas de una variable del mismo tipo se puede escribir  el tipo de ellas"
     + " seguido por el identificador de cada una separadas por comas y al final ; "
     + "\n \n El identificador deber ser unico; Todos los datos, incluyendo objetos, deben estar declarados antes de su uso";


     while (flag) {
       println("\n========= MENÚ =========");
       println("1. Que es un identificador?");
       println("2. Palabras Reservadas");
       println("3. Datos primitivos");
       println("4. Referencias");
       println("5. Variables");
       println("7. Salir");
       println("Selecciona una opción: ");

       int opcion = scanner.nextInt();
       scanner.nextLine();

       switch (opcion) {
         case 1:
         println(identificador);
         esperarEnter(scanner);
         break;
         case 2:
         println(palabraRes);
         esperarEnter(scanner);
         break;
         case 3:
         println(primitivos);
         esperarEnter(scanner);
         break;
         case 4:
         println(referencia);
         esperarEnter(scanner);
         break;
         case 5:
         println(variables);
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

     System.out.println(verdad);

   }
 }
