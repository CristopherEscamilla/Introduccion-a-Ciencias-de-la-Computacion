import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
/**
* Clase {@code EscrituraV2} que demuestra el uso moderno del paquete {@code java.nio.file}
* para escribir archivos de texto en Java.
*
* <p>El paquete {@code java.nio.file} reemplaza a las clases antiguas como
* {@link java.io.FileWriter} y {@link java.io.FileOutputStream}, ofreciendo una API más segura,
* eficiente y flexible para manejo de archivos.</p>
*
* <p>Esta clase muestra tres formas de escritura:</p>
* <ul>
*   <li>Usando {@link java.nio.file.Files#writeString(Path, CharSequence, java.nio.charset.Charset, java.nio.file.OpenOption...)}
*       para escribir texto simple.</li>
*   <li>Usando {@link java.nio.file.Files#write(Path, Iterable, java.nio.charset.Charset, java.nio.file.OpenOption...)}
*       para escribir listas de líneas.</li>
*   <li>Usando {@link java.nio.file.Files#newBufferedWriter(Path, java.nio.charset.Charset, java.nio.file.OpenOption...)}
*       para escribir múltiples líneas desde un arreglo con control manual del buffer.</li>
* </ul>
*
* <p><b>Compatibilidad:</b> este código aplica desde Java 11 en adelante.</p>
*
* @author
*     Cristopher Escamilla
* @version
*     2025-2
* @since
*     Java 11
*/
public class EscrituraV2 {
  /**
  * Representa la ruta del archivo en el sistema.
  * Puede ser relativa o absoluta. En este ejemplo, se crea o usa el archivo {@code salida.txt}.
  */
  static Path archivo = Paths.get("salida.txt");

  public static void main(String[] args) {

    /*
    * ===============================================================
    * EJEMPLO 1: Escribir texto simple con Files.writeString()
    * ===============================================================
    * Desde Java 11, permite escribir texto directamente sin convertirlo a bytes.
    * Ideal para casos sencillos o creación rápida de archivos.
    */
    try {
      String contenido = "Hola Java NIO";
      Files.writeString(
      archivo,
      contenido,
      StandardCharsets.UTF_8,
      StandardOpenOption.CREATE,            // crea el archivo si no existe
      StandardOpenOption.TRUNCATE_EXISTING // borra el contenido previo si ya existe
      );
      System.out.println("Archivo escrito correctamente.");
    } catch (IOException e) {
      e.printStackTrace();
    }

    /*
    * ===============================================================
    * EJEMPLO 2: Escribir una lista de líneas con Files.write()
    * ===============================================================
    * Permite escribir múltiples líneas desde una lista.
    * Cada elemento de la lista se convierte en una línea del archivo.
    *
    * StandardOpenOption.APPEND agrega el contenido al final del archivo existente.
    */
    try {
      List<String> lineas = List.of(
      "Primera línea",
      "Segunda línea",
      "Tercera línea"
      );

      Files.write(
      archivo,
      lineas,
      StandardCharsets.UTF_8,
      StandardOpenOption.CREATE,
      StandardOpenOption.APPEND
      );

      System.out.println("Líneas escritas correctamente.");
    } catch (IOException e) {
      e.printStackTrace();
    }

    /*
    * ===============================================================
    * EJEMPLO 3: Escribir desde un arreglo con BufferedWriter
    * ===============================================================
    * Usa newBufferedWriter() para escribir grandes volúmenes de texto con eficiencia.
    * Permite controlar cuándo se escriben las líneas y agregar saltos manualmente.
    */
    String[] lineas = { "Uno", "Dos", "Tres", "Cuatro" };

    try (BufferedWriter writer = Files.newBufferedWriter(
    archivo,
    StandardCharsets.UTF_8,
    StandardOpenOption.CREATE,
    StandardOpenOption.TRUNCATE_EXISTING)) {

      for (String linea : lineas) {
        writer.write(linea);
        writer.newLine(); // salto de línea
      }

      System.out.println("Archivo escrito correctamente con BufferedWriter.");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
