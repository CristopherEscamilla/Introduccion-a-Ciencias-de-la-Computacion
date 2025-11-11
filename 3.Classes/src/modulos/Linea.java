package src.modulos;
import java.lang.*;
/**
* Representa un segmento de línea definido por dos puntos en el plano cartesiano.
* Permite calcular su pendiente, su ecuación, y realizar comprobaciones como
* paralelismo, perpendicularidad y pertenencia de puntos a la línea.
*
* @author Cristopher Escamilla
* @version 1.0
*/
public class Linea{
  private Punto puntoA;
  private Punto puntoB;

  /**
  * Crea una línea a partir de dos puntos dados.
  *
  * @param puntoA el primer punto de la línea
  * @param puntoB el segundo punto de la línea
  */
  public Linea (Punto puntoA,Punto puntoB){
    this.puntoA = puntoA;
    this.puntoB = puntoB;
  }
  /**
  * Crea una línea por defecto entre los puntos (0,0) y (1,1).
  */
  public Linea (){
    this(new Punto(0,0),new Punto (1,1));
  }
  /**
  * Crea una nueva línea copiando los puntos de otra línea existente.
  *
  * @param linea la línea a copiar
  */
  public Linea(Linea linea){
    this(linea.puntoA,linea.puntoB);
  }
  /**
  * Calcula la pendiente de la línea.
  *
  * @return la pendiente; Double.POSITIVE_INFINITY si la línea es vertical
  */
  public  double pendiente(){
    double divisor = puntoB.getX() - puntoA.getX();
    if(divisor != 0){
      return (puntoB.getY()-puntoA.getY())/divisor;
    }
    return Double.POSITIVE_INFINITY;
  }
  /**
  * Obtiene la ecuación de la línea en forma explícita.
  *
  * @return la ecuación en formato  y = mx + b o x = c si es vertical
  */
  public String ecuacion(){
    if(pendiente() == Double.POSITIVE_INFINITY){
      return "x = " + puntoA.getX();
    }
    if(pendiente() == 0){
      return "y = " + ordenada();
    }
    return (ordenada() >= 0) ? "y = " +pendiente()+"x + " + ordenada()
    : "y = " +pendiente()+"x " + ordenada();
  }
  /**
  * Calcula la ordenada al origen (intersección con el eje Y).
  *
  * @return la ordenada; Double.POSITIVE_INFINITY si la línea es vertical
  */
  public double ordenada(){
    return (puntoA.getX() == puntoB.getX())? Double.POSITIVE_INFINITY
    :puntoA.getY() - pendiente()*puntoA.getX();
  }
  /**
  * Verifica si un punto dado pertenece a la misma recta que pasa por los extremos de la línea.
  *
  * @param p el punto a comprobar
  * @return true si el punto está alineado con los extremos,  false en caso contrario
  */
  public boolean contiene(Punto p){
    return p.estanAlineados(puntoA,puntoB);
  }
  /**
  * Verifica si esta línea es paralela a otra línea.
  *
  * @param linea la otra línea a comparar
  * @return true si tienen la misma pendiente, false en caso contrario
  */
  public boolean esParalelaA(Linea linea){
    return pendiente() == linea.pendiente();
  }
  /**
  * Verifica si esta línea es perpendicular a otra línea.
  *
  * @param linea la otra línea a comparar
  * @return true si son perpendiculares, false en caso contrario
  */
  public boolean esPerpendicular(Linea linea){
    double m = pendiente();
    double m1 = linea.pendiente();
    boolean perpendicular;
    perpendicular = (m == 0 && m1 == Double.POSITIVE_INFINITY) || (m1 == 0 && m == Double.POSITIVE_INFINITY);
    if(!perpendicular){
      perpendicular = m == -1/m1;
    }
    return perpendicular;
  }

}
