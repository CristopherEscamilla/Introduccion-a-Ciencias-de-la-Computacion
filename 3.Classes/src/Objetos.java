package src;
import java.util.Scanner;
/**
*@author Cristopher Escamilla
*@version 1.0s
*/
class Objetos{
    public static void main(String[] args) {
      /**Para crear un objeto se requiere utilizar el operador
      *  "new" seguido del nombre de la clase a la que pertenece
      *  dicho objeto
      */
      //se crea un nuevo objeto
      String ejemplo = new String("Hola");
      System.out.println("Escribe una palabra");
      Scanner sc = new Scanner(System.in);
      /**
      * Crea un objeto reservando en memoria el espacio necesario para mantener
      * el estado, y devuelve una referencia
      * Una referencia es un tipo de dato usado para trabajar con objetos
      */
      System.out.println(ejemplo);


      /**
      * Una vez creado un objeto se le pueden enviar mensajes para conocer su
      * estado, modificarlo o ejecutar algun metodo..
      * Cada mensaje enviado se implementa mediante la llamada a un metodo
      * haciendo uso de la notacion "." referenciaObjeto.nombreMetodo(a,2,3);
      * cada elemento de la lista de parametros esta separado por comas ","
      */
      /**
      * JAVA STRING POOL
      * Java de forma interna implementa el patrón flyweight y genera
      * un pool de Strings que se comparte.
      * De esta forma cada vez que nosotros necesitamos crear una nueva
      * cadena Java revisa si ya existe en el pool, en tal caso nos devuelve
      * una referencia a ella.
      *
      * los Strings son objetos Inmutables , es decir una vez creado un String
      * jamas puede ser modificado.  Cada vez que modificamos una cadena
      * la realidad es que se crea una nueva.
      */

      String saludo = "Hola";
      String saludo2 = "Hola";
      System.out.println("\n " + saludo);
      System.out.println(ejemplo==saludo);
      System.out.println(saludo2==saludo);

      boolean x = ejemplo.equals(saludo);
      System.out.println(x);

      /**Metodos mas comunes de STRING
      * charAt(int)   devuelve el caracter  de la posicion indicada
      * aquals(String)devuelve true si la cadanea pasada como parametro
      *               es igual a la cadena que llama el metodo.False si no
      * indexOf(Strign)devuelve la posicion en donde empieza la subcadena
      *                pasada como parametros
      * length()       devuelve la cantidad de caracteres que tiene la cadena
      * substring(int,int) Devuelve la cadena formada por los caracteres que
      *                    estan entre la posicion indicada
      * toLowerCase()      Devuelve la cadena en minusculas
      * toUperCase()       Devuelve la cadena en mayusculas
      * trim()             Devuelve la cadena sin espacios al final
      */
    }
}
