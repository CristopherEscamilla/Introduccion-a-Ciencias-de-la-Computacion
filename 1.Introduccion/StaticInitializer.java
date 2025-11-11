import java.util.*;
/**
*  Este programa lee dos valores enteros desde la entrada estándar que representan
 * la base (B) y la altura (H) de un rectángulo. Luego verifica si ambos valores
 * son positivos. Si no lo son, imprime una excepción con un mensaje de error.
 * Si los valores son válidos, calcula el área del rectángulo (B × H) y la muestra.
 *
 * Como se ha visto, se puede proporcionar un valor inicial para un campo en su declaración:
 *     // initialize to 10
 *     public static int capacity = 10;
 *
 *     // initialize to false
 *     private boolean full = false;
 *
 * Esto funciona bien cuando el valor de inicialización está disponible y la inicialización
 * se puede poner en una línea. Sin embargo, esta forma de inicialización tiene limitaciones
 * debido a su simplicidad. Si la inicialización requiere cierta lógica (por ejemplo, manejo
 * de errores o un bucle para llenar una matriz compleja), la asignación simple es inadecuada.
 *
 * Las variables de instancia se pueden inicializar en constructores, donde se puede usar
 * el manejo de errores u otra lógica. Para proporcionar la misma capacidad para las variables
 * de clase, el lenguaje de programación Java incluye bloques de inicialización estáticos.
 *
 * Bloques de inicialización estáticos
 * Un bloque de inicialización estático es un bloque normal de código entre llaves
 * y precedido por la palabra clave {static}. Aquí hay un ejemplo:
 *
 * static {
 *     // whatever code is needed for initialization goes here
 * }
 *
 * Una clase puede tener cualquier número de bloques de inicialización estáticos
 * y pueden aparecer en cualquier parte del cuerpo de la clase. El sistema de tiempo
 * de ejecución garantiza que los bloques de inicialización estáticos se llamen en
 * el orden en que aparecen en el código fuente.
 *
 * Nota: No es necesario declarar campos al principio de la definición de clase,
 * aunque esta es la práctica más común. Solo es necesario que se declaren e inicialicen
 * antes de que se utilicen.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
 */
class StaticInitializer {

  private static int B;
  private static int H;
  private static boolean flag;

  static {
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    H = scan.nextInt();
    scan.close();
    if (B <= 0 || H <= 0) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
      flag = false;
    } else {
      flag = true;
    }
  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);    }
    }
  }
