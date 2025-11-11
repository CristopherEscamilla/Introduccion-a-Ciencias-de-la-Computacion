import java.io.*;
/**
* Clase {@code Lectura} que demuestra cómo leer archivos de texto en Java
* utilizando flujos con codificación UTF-8.
*
* <p>Este ejemplo emplea la combinación de:
* <ul>
*   <li>{@link java.io.FileInputStream} — abre el archivo en modo lectura binaria.</li>
*   <li>{@link java.io.InputStreamReader} — convierte bytes a caracteres según la codificación especificada (UTF-8).</li>
*   <li>{@link java.io.BufferedReader} — permite leer líneas completas de forma eficiente.</li>
* </ul>
*
* <p>La clase muestra dos enfoques:</p>
* <ol>
*   <li>Uso de <b>try-with-resources</b> para cierre automático del flujo.</li>
*   <li>Uso de <b>try-catch-finally</b> para cierre manual (comentado como referencia).</li>
* </ol>
*
* <p>Ambos métodos garantizan el cierre seguro de los recursos, evitando fugas de memoria y errores
* por archivos abiertos.</p>
*
* @author
*     Cristopher Escamilla
* @version
*     2025-2
*/
public class Lectura {
  public static void main(String[] args) {
    // Representa el archivo a leer.
    File archivo = new File("Mi archivo.txt");

    /*
    * ===============================================================
    * ESTRUCTURA DE LECTURA
    * ===============================================================
    * FileInputStream  → abre el archivo en modo lectura binaria.
    * InputStreamReader → convierte los bytes a caracteres (UTF-8).
    * BufferedReader    → permite leer líneas completas de texto eficientemente.
    *
    * Se leen las líneas hasta que readLine() devuelve null.
    * Finalmente, se cierra automáticamente el flujo gracias al try-with-resources.
    */

    try (BufferedReader reader = new BufferedReader(
    new InputStreamReader(
    new FileInputStream(archivo), "UTF-8"
    ))) {

      String linea;
      while ((linea = reader.readLine()) != null) {
        System.out.println(linea);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    /*
    * ===============================================================
    * OPCIÓN ALTERNATIVA: TRY-CATCH-FINALLY
    * ===============================================================
    * Ejemplo comentado que muestra cómo cerrar manualmente los flujos
    * cuando no se utiliza try-with-resources (versión más antigua de Java).
    *
    * BufferedReader reader = null;
    *
    * try {
    *     reader = new BufferedReader(
    *         new InputStreamReader(
    *             new FileInputStream(archivo), "UTF-8"
    *         )
    *     );
    *
    *     String linea;
    *     while ((linea = reader.readLine()) != null) {
    *         System.out.println(linea);
    *     }
    *
    * } catch (IOException e) {
    *     e.printStackTrace();
    *
    * } finally {
    *     if (reader != null) {
    *         try {
    *             reader.close();
    *         } catch (IOException ex) {
    *             ex.printStackTrace();
    *         }
    *     }
    * }
    */

  }
}
