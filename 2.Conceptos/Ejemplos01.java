public class Ejemplos01{
  public static void main(String[] args) {
    //Declaracion de variables
    int a,b,c,d;
    int edad;
    double altura;
    char caracter;
    boolean bandera;
    //Declarcion de constantes
    final int  IVA = 16;
    //Asignacion de variables
    a=2;
    b=4;
    c=a+b;
    d=b;

    //Asignacion multiple
    int f,g,h;
    f=g=h=25;

    int div = 5;
    int dividendo = 39;
    double dividendoDouble = 39.0;

    System.out.println("Division");
    System.out.println(dividendo/div);
    System.out.println(dividendoDouble/div);
    System.out.println(dividendo % 4);

    System.out.println("Incremento / Decremento");
    System.out.println(div++);
    System.out.println(div--);

    System.out.println("Operador de asignacion compuesto");
    int i =50, j =4;
    i /= 45; // Equivalente i = i / 45
    System.out.println(i);
    i *= j +6;//Equivalente a i = i * (j + 6)
    System.out.println(i);
  }
}
