import java.util.*;
import java.io.*;
/**
 * Este programa determina si una cadena ingresada por el usuario es un palíndromo.
 *
 * Un palíndromo es una palabra o frase que se lee igual al derecho y al revés.
 * El programa invierte la cadena manualmente utilizando un bucle, luego compara
 * la original con la invertida para verificar si son iguales.
 *
 * Utiliza métodos de la clase {String} como {charAt()}, {length()},
 * {trim()} y {equals()} para el procesamiento y comparación de cadenas.
 *
 * El programa no ignora mayúsculas/minúsculas ni espacios internos.
 * Se podría mejorar para ser más flexible si es necesario.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.lang.String
 * @see java.util.Scanner
 */
class Palindromo{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String res = "";

    System.out.println(A.length());
    for (int i = A.length()-1; i != -1; i-- ) {
      res = res + A.charAt(i);

    }
    if(A.trim().equals(res.trim())){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }



  }
}
