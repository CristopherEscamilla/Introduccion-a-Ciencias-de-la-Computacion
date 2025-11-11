import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;
/**
* Clase {@code LecturaV2} que demuestra distintas formas modernas de leer archivos de texto
* utilizando la API {@code java.nio.file}, disponible desde Java 11.
*
* <p>Incluye tres métodos de lectura:
* <ul>
*   <li>Lectura completa del archivo como una sola cadena ({@link Files#readString(Path, java.nio.charset.Charset)}).</li>
*   <li>Lectura del archivo línea por línea almacenando el contenido en una lista ({@link Files#readAllLines(Path, java.nio.charset.Charset)}).</li>
*   <li>Lectura secuencial usando {@link BufferedReader}, ideal para archivos grandes.</li>
* </ul>
*
* <p>Esta clase usa codificación UTF-8 para asegurar compatibilidad con acentos, símbolos y emojis.</p>
*
* @author
*     Cristopher Escamilla
* @version
*     2025-2
* @since
*     Java 11
*/
public class LecturaV2{
public static void main(String[] args) {
  // Representa la ruta al archivo a leer (relativa al proyecto).
  Path archivo = Paths.get("salida.txt");
  /*
           * Lectura 1:
           * Files.readString() lee el contenido completo del archivo como un solo texto.
           * Si el archivo es grande, puede consumir más memoria.
           */
  try {String contenido = Files.readString(archivo, StandardCharsets.UTF_8);
    System.out.println("Contenido del archivo:\n" + contenido);
  } catch (IOException e) {
    e.printStackTrace();
  }

  /*
           * Lectura 2:
           * Files.readAllLines() lee todas las líneas y las guarda en una lista de String.
           * Es útil para procesar líneas de forma estructurada, aunque carga todo en memoria.
           */
try {
  List<String> lineas = Files.readAllLines(archivo, StandardCharsets.UTF_8);
  System.out.println("Líneas del archivo:");
  for (String linea : lineas) {
    System.out.println(linea);
  }
} catch (IOException e) {
  e.printStackTrace();
}
/*
        * Lectura 3:
        * Files.newBufferedReader() crea un lector eficiente línea por línea.
        * Ideal para leer archivos grandes sin cargar todo el contenido en memoria.
        */
try (BufferedReader reader = Files.newBufferedReader(archivo, StandardCharsets.UTF_8)) {
  String linea;
  System.out.println("Contenido línea por línea:");
  while ((linea = reader.readLine()) != null) {
    System.out.println(linea);
  }
} catch (IOException e) {
  e.printStackTrace();
}
}
}
