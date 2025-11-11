import java.util.Scanner;
import java.io.*;
public class Objetos{

  public static void main(String[] args) {
      //Creacion de un objeto
      //Importante, esto crea una Referencia
      Scanner sc = new Scanner(System.in);

      //Los parentesis sirven para crear un objeto con un Estado
      //especial

      //Podemos enviar mensajes, ya sea para conocer su Estado
      //modificar su estado, realizar algun calculo, etc..

      //Cada mensaje enviado se implementa mediante la llamada a un metodo
      //referenciaDelObj.nombreDelMetodo(parametros separados por comas);
      String dumm;
       dumm = sc.nextLine();

       //Signatura o firma de un metodo
       //nombre del metodo y lista de parametros
       //Lista que indica el tipo y nombre de los parametros

       if(1>3){
         //se ejecuta este bloque si el condicional es true
         System.out.println("Bloque del if si se cumple la condicion");
       }else{
         //se ejecuta este bloque si el condicional es false
         System.out.println("Bloque del if si no se cumple la condicion");
       }

       if(1>2){
         System.out.println("No es necesario el else, pero nos da mas control");
       }

  }
}
