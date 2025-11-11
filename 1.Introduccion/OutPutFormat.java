import java.util.Scanner;
/**
 * La clase lee tres pares de entradas desde la consola:
 * una cadena y un número entero, y los imprime en un formato alineado.
 * Cada cadena se ajusta a 15 caracteres y cada número se imprime con tres dígitos,
 * rellenando con ceros si es necesario.
 * Ejemplo de salida:
 * ================================
 * Java           007
 * Python         065
 * C              100
 * ================================
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.util.Scanner
 */

class OutPutFormat{
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("================================");
    for(int i=0;i<3;i++)
    {
      String s1=sc.next();
      String spaces = s1 + "               ";
      spaces = spaces.substring(0, 15);
      int x=sc.nextInt();
      String xFormatted;
      if (x < 10) {
        xFormatted = "00" + x;
      } else if (x < 100) {
        xFormatted = "0" + x;
      } else {
        xFormatted = "" + x;
      }
      System.out.println(spaces + xFormatted);
    }
    System.out.println("================================");
  }


}
