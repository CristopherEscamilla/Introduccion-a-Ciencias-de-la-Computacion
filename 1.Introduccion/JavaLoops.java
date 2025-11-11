import java.util.*;
import java.io.*;

/**
 * La clase genera la tabla de multiplicar del número ingresado por el usuario.
 * Utiliza {@link BufferedReader} para leer la entrada desde la consola, y luego imprime
 * los productos del número desde 1 hasta 10 en formato estándar.
 * Ejemplo de salida si el usuario ingresa 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.io.BufferedReader
 * @see java.io.InputStreamReader
 */

class JavaLoops {
  public static void main(String[] args)throws IOException { {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());
    /*
    La instrucción proporciona una manera compacta de iterar sobre un rango de valores.
    Los programadores a menudo se refieren a él como el "bucle for" debido a la forma en que se repetidamente
    hasta que se cumple una condición particular. La forma general de la declaración se puede expresar de la siguiente manera:

    for (initialization; termination; increment) {
    statement(s)
    }

    Al usar esta versión de la declaración, tenga en cuenta que:

    La expresión de inicialización que inicializa el bucle; se ejecuta una vez, cuando comienza el bucle.
    Cuando la expresión de terminación se evalúa como false, el bucle termina.
    La expresión de incremento se invoca después de cada iteración a través del bucle;
    es perfectamente aceptable que esta expresión incremente o disminuya un valor.
    */
    for (int i = 1; i <= 10; i++) {
      System.out.println(N + " x " + i + " = " + N * i);
    }
    bufferedReader.close();
  }
}
}
