/**
* Clase principal {@code Threads} que demuestra el uso básico de hilos (threads)
* en Java, incluyendo la creación, ejecución y sincronización entre hilos.
*
* <p>También muestra cómo compartir un recurso común entre varios hilos,
* en este caso un objeto {@link Contador}, que representa una región crítica.</p>
*
* <p>Este ejemplo incluye:</p>
* <ul>
*   <li>Creación de hilos simples que ejecutan tareas independientes.</li>
*   <li>Uso del método {@code start()} para iniciar la ejecución concurrente.</li>
*   <li>Pausas con {@code Thread.sleep()} para simular trabajo.</li>
*   <li>Demostración de acceso compartido a un objeto no sincronizado.</li>
* </ul>
*
* @author
*     Cristopher Escamilla
* @version
*     2025-2
* @since
*     Java 8
*/
public class Threads {
  public static void main(String[] args) {
    System.out.println("Inicio del programa (hilo principal)");
    Contador contador = new Contador();


    // Crear un hilo que ejecuta una tarea simple
    Thread hilo1 = new Thread(new TareaSimple("Hilo 1"));
    Thread hilo2 = new Thread(new TareaSimple("Hilo 2"));
    Thread hilo3 = new Thread(new TareaSimple("Hilo 3"));

    // Creamos dos hilos que comparten el mismo contador
    //Thread hiloC1 = new Thread(new TareaIncremento(contador));
    //Thread hiloC2 = new Thread(new TareaIncremento(contador));

    // Iniciar los hilos
    hilo1.start();
    hilo2.start();
    hilo3.start();

    // El hilo principal sigue su ejecución
    for (int i = 1; i <= 5; i++) {
      System.out.println("[Principal] Ejecutando paso " + i);

      try {
        Thread.sleep(200); // pausa medio segundo
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Fin del programa (hilo principal)");


    //hiloC1.start();
    //hiloC2.start();

    // Esperamos que ambos terminen
    //try {
    //     hiloC1.join();
    //     hiloC2.join();
    //} catch (InterruptedException e) {
    //     e.printStackTrace();
    //}

    //System.out.println("Valor final del contador: " + contador.getValor());


  }

}
/**
* Clase {@code Contador} que representa un valor entero compartido entre hilos.
*
* <p>No es segura para hilos (no es thread-safe) porque el método
* {@link #incrementar()} no está sincronizado. Si varios hilos lo usan
* simultáneamente, podrían ocurrir condiciones de carrera.</p>
*/
class Contador {
  private int valor = 0;

  public void incrementar() {
    // Región crítica (no sincronizada)
    valor++;
  }

  public int getValor() {
    return valor;
  }
}
/**
* Clase {@code TareaSimple} que implementa {@link Runnable} para ejecutar
* una acción sencilla en un hilo independiente.
*/
class TareaSimple implements Runnable {
  private String nombre;

  public TareaSimple(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public void run() {


    try {
      Thread.sleep(180); // pausa 0.7 segundos entre pasos
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(nombre + " RECORDATORIO " );
  }
}



/**
* Clase {@code TareaIncremento} que implementa {@link Runnable} y se encarga
* de incrementar un contador compartido muchas veces.
*/
class TareaIncremento implements Runnable {
  private Contador contador;
  /**
  * Constructor que recibe el objeto {@link Contador} compartido.
  *
  * @param contador Objeto que será modificado por varios hilos.
  */
  public TareaIncremento(Contador contador) {
    this.contador = contador;
  }

  @Override
  public void run() {

    for (int i = 0; i < 100_000; i++) {

      contador.incrementar();
    }
  }
}
