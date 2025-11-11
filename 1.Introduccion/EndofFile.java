import java.util.*;
import java.io.*;
/**
 * Este programa lee líneas de texto desde la entrada estándar hasta que no haya más (EOF - End Of File).
 * Por cada línea leída, imprime el número de línea seguido del contenido de esa línea.
 *
 * Entrada:
 * - Una cantidad indefinida de líneas de texto ingresadas por el usuario o desde un archivo.
 *
 * Salida:
 * - Cada línea se imprime precedida por su número de línea.
 *
 * Ejemplo de entrada:
 *   Hello world
 *   Java is fun
 *
 * Ejemplo de salida:
 *   1 Hello world
 *   2 Java is fun
 *
 * Nota:
 * - Para probar este programa manualmente, debe utilizar un archivo texto
 * - he dejado un archivo de prueba llamado input.texto
 * para ejecutarlo:
 * java EndOfFile < input.txt
 * Es un comando de la terminal que ejecuta tu programa EndOfFile y
 * redirige la entrada estándar (System.in) para que lea desde el archivo
 * input.txt en lugar del teclado.

 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.util.Scanner
 */
class EndOfFile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    //hasNext() Devuelve true si este escáner tiene otro token en su entrada.
    //Este método puede bloquearse mientras espera la entrada para escanear.
    //El escáner no avanza más allá de ninguna entrada.
    while (sc.hasNext()) {
      System.out.println(i++ + " " + sc.nextLine());
    }
    sc.close();
  }
}
