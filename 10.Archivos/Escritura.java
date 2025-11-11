import java.io.*;
import java.io.IOException;
/**
* Clase {@code Escritura} que demuestra varias formas de escribir texto en archivos en Java.
*
* <p>Incluye ejemplos con:
* <ul>
*   <li>{@link java.io.FileWriter} — forma simple y directa de escribir texto.</li>
*   <li>{@link java.io.BufferedWriter} — mejora el rendimiento al reducir accesos al disco.</li>
*   <li>{@link java.io.OutputStreamWriter} con {@link java.io.FileOutputStream} — ideal para
*       aplicaciones internacionales o cuando se requiere control sobre la codificación (UTF-8).</li>
* </ul>
*
* <p>Esta clase muestra buenas prácticas de manejo de recursos en Java, incluyendo:
* <ul>
*   <li>Uso de <b>try-with-resources</b> para cierre automático de flujos.</li>
*   <li>Uso de <b>try-catch-finally</b> para cierre manual y manejo explícito de errores.</li>
* </ul>
*
* <p>El código escribe texto codificado en UTF-8 en un archivo, asegurando compatibilidad con acentos,
* emojis y caracteres especiales.
*
* @author
*     Cristopher Escamilla
* @version
*     2025-2
*/

public class Escritura{

  static String nombre="Mi archivo.txt";
  static File archivo=new File(nombre);
  static BufferedWriter bw1= null;

  public static void main(String[] args) {
    /*
    * ===============================================================
    * EJEMPLO 1: FileWriter
    * ===============================================================
    * Es la forma más simple de escribir texto en archivos,
    * pero también la menos flexible. Usa la codificación por defecto del sistema.
    *
    * Debe evitarse cuando se manejan grandes volúmenes de texto o se requiere
    * compatibilidad con caracteres internacionales.
    *
    * try (FileWriter fw = new FileWriter("archivoFW.txt", false)) {
    *     fw.write("Texto con FileWriter\n");
    *     fw.write("Texto adicional con FileWriter 1\n");
    *     fw.write("Texto adicional con FileWriter 2\n");
    * } catch (IOException e) {
    *     e.printStackTrace();
    * }
    */

    /*
    * ===============================================================
    * EJEMPLO 2: BufferedWriter + FileWriter
    * ===============================================================
    * Ideal para escribir muchas líneas o grandes cantidades de texto,
    * ya que utiliza un buffer que reduce el número de accesos al disco.
    *
    * try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt", true))) {
    *     bw.write("Texto con BufferedWriter + FileWriter");
    *     bw.newLine();
    *     bw.write("Más texto con buffer\n");
    * } catch (IOException e) {
    *     e.printStackTrace();
    * }
    */

    /*
    * ===============================================================
    * EJEMPLO 3: BufferedWriter + OutputStreamWriter + FileOutputStream (UTF-8)
    * ===============================================================
    * Forma profesional y recomendada cuando:
    * - Se requiere soporte para múltiples idiomas o emojis.
    * - Se desea controlar la codificación del texto (UTF-8, ISO-8859-1, etc.).
    * - Se busca mayor robustez y flexibilidad en la escritura.
    */

    try (BufferedWriter writer = new BufferedWriter(
    new OutputStreamWriter(
    new FileOutputStream(archivo, true),
    "UTF-8"
    ))) {
      writer.write("Texto con codificación UTF-8 profesional");
      writer.newLine();
      writer.write("Mas textooo con buffer 😎 \n");
    } catch (IOException e) {
      e.printStackTrace();
    }

    /*
    * ===============================================================
    * EJEMPLO 4: Try-Catch-Finally (Cierre manual)
    * ===============================================================
    * En este caso no se usa try-with-resources.
    * Se cierra el flujo manualmente dentro del bloque finally.
    * Es útil cuando se necesita más control sobre la gestión de errores.
    */

    try {
      bw1 = new BufferedWriter(
      new OutputStreamWriter(
      new FileOutputStream(archivo, true), // true = append
      "UTF-8"
      )
      );

      bw1.write("Texto con codificación UTF-8 profesional");
      bw1.newLine();
      bw1.write("Más texto con buffer 😎 \n");

    } catch (IOException e) {
      e.printStackTrace();

    } finally {

      if (bw1 != null) {
        try {
          // Cerrar manualmente el recurso
          bw1.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
    }


  }
}
