import java.util.*;
/**
 * Esta clase lee un número entero desde la entrada estándar y evalúa su valor
 * para imprimir un mensaje según las siguientes reglas:
 *
 *  Si el número es impar, imprime "Weird"
 *  Si el número es par y está entre 2 y 5, imprime "Not Weird"
 *  Si el número es par y está entre 6 y 20, imprime "Weird"
 *  Si el número es par y mayor que 20, imprime "Not Weird"
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.util.Scanner
 */

class JavaIfElse{
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
      int N = scanner.nextInt();
       /**
       * La instrucción `if-then` es la más básica de todas las instrucciones
       * de flujo de control.
       * Le indica al programa que ejecute una determinada sección de código
       * solo si una condición se evalúa como verdadera.
       *     if (isMoving) {
       *         // cláusula "then"
       *     }
       * Si la condición se evalúa como falsa,
       * el control salta al final de la declaración `if`.
       *
       * Además, las llaves de apertura y cierre son opcionales si la cláusula "then"
       * contiene solo una instrucción:
       *
       *     if (isMoving)
       *         currentSpeed--;
       * La instrucción if-then-else proporciona un camino alternativo de ejecución
       * cuando la cláusula if se evalúa como falsa.
       *
       *     if (isMoving) {
       *           // codigo then
       *       } else {
       *           // codigo else
       *     }

       */

      if((N % 2) != 0){
        System.out.println("Weird");
      }else{
        if(N>=2 && N<=5){
          System.out.println("Not Weird");
        }else{
          if(N>=6 && N<=20){
            System.out.println("Weird");
          }else{
            System.out.println("Not Weird");
          }
        }
      }
      scanner.close();
    }

}
