package src;

import src.modulos.Punto;
import src.modulos.Carro;
import src.modulos.Linea;
/**
 * Clase principal que ejecuta el programa.
 * Demuestra el uso de las clases {@link Punto} y {@link Carro}:
 * Compilación y ejecución:
 * Posicionados en la carpeta raiz (cd JavaClasses)
 * Compilar todas las clases indicando la carpeta de salida(out):
 *
 * javac -d out src/*.java src/modulos/*.java
 *
 * Otra forma más genérica (busca todos los .java recursivamente):
 * javac -d out $(find . -name "*.java")
 *
 * Ejecutar el programa indicando el classpath y la clase principal:
 * java -cp out src.Main
 * Explicación:
 * -d out</code> → Le dice a javac que coloque los .class en la carpeta out/,
 *       respetando los paquetes (por eso crea out/src/modulos/
 * -cp out → Al ejecutar, Java necesita saber dónde están los .class,
 *       por eso se indica la carpeta de salida como classpath.
 * El nombre src.Main → Es el nombre completo del paquete + clase,
 *       porque en el código Main está en el paquete src
 *
 * @author  Cristopher Escamilla
 * @version 1.0
 */
public class Main{
  public static void main(String[] args) {
    // Crear puntos
    Punto punto1 = new Punto(2,3);
    Punto punto2 = new Punto(7,11);
    Punto punto3 = new Punto(3, 5);
    Punto punto4 = new Punto(4, 7);

    // Crear carros
    Carro carro = new Carro("Rojo","F200");
    Carro carro2 = new Carro();

    // Obtener colores de los carros
    String carro1Color = carro.getColor();
    String carro2Color = carro2.getColor();
    // Mostrar coordenadas iniciales de punto1
    double x = punto1.getX();
    double y = punto1.getY();
    System.out.println(punto1);
    System.out.println("Punto 1, coordenada x = " + x +", coordenada y = " + y);
    System.out.println("Cambiando coordenadas........");

    // Cambiar coordenadas de punto1
    //punto1.setX(20);
    //punto1.setY(15);

    // Mostrar nuevas coordenadas
    x=punto1.getX();
    y=punto1.getY();
    System.out.println("Punto 1 , coordenada x = " + x +", coordenada y = " + y);
    System.out.println("Distancia del punto 1 al 2 = " + punto1.distancia(punto2));
    System.out.println("Estan Alineados " + punto1.alineados(punto3,punto4));
    System.out.println(punto1);
    // Mostrar información de carros
    System.out.println("color carro1 " + carro1Color);
    System.out.println("color carro2 " + carro2Color);
    System.out.println("ruedas: " + carro2.getRueditas());

    Punto a = new Punto(0, 0);
           Punto b = new Punto(2, 2);
           Punto c = new Punto(0, 2);
           Punto d = new Punto(2, 0);
           Punto e = new Punto(1, 1);

           Linea l1 = new Linea(a, b); // pendiente = 1
           Linea l2 = new Linea(c, d); // pendiente = -1
           Linea l3 = new Linea(a, new Punto(0, 5)); // vertical
           Linea l4 = new Linea(a, new Punto(5, 0)); // horizontal

           System.out.println("Línea 1: " + l1.ecuacion());
           System.out.println("Línea 2: " + l2.ecuacion());
           System.out.println("Línea 3 (vertical): " + l3.ecuacion());
           System.out.println("Línea 4 (horizontal): " + l4.ecuacion());

           System.out.println("L1 contiene punto (1,1): " + l1.contiene(e));
           System.out.println("L1 es paralela a L2: " + l1.esParalelaA(l2));
           System.out.println("L1 es perpendicular a L2: " + l1.esPerpendicular(l2));
           System.out.println("L3 es perpendicular a L4: " + l3.esPerpendicular(l4));
  }

}
