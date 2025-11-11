package src.modulos;
import java.lang.Math;
/**
* Clase que representa un punto en el plano cartesiano con coordenadas X y Y.
* Permite crear puntos con valores por defecto (0,0) o con coordenadas personalizadas,
* además de consultar y modificar sus valores.
*
* @author  Cristopher Escamilla
* @version 1.0
*/
public class Punto{
  // Coordenada X del punto
  private double x;
  // Coordenada Y del punto
  private double y;
  /**
  * Constructor por omision.
  * Inicializa el punto en el origen (0,0).
  */
  public Punto(){
    x = 0.0;
    y = 0.0;
  }
  /**
  * Constructor con parámetros.
  *
  * @param xIni Coordenada inicial en el eje X.
  * @param yIni Coordenada inicial en el eje Y.
  */
  public Punto(double xIni, double yIni){
    x=xIni;
    y=yIni;
  }
  /**
   * Calcula la distancia euclidiana entre este punto y otro punto dado.
   *
   * @param p el punto al cual se desea calcular la distancia desde este punto
   * @return la distancia entre este punto y el punto  p
   */
  public double distancia(Punto p){
    return Math.sqrt( (((p.getX()-x) * (p.getX()-x)) + (((p.getY()-y) * (p.getY()-y)))));
  }
  /**
 * Verifica si este punto, junto con los puntos p1 y p2, están alineados (colineales).
 *
 * Utiliza la comparación de pendientes entre los segmentos  this → p1 y  p1 → p2
 * sin realizar divisiones para evitar errores de precisión.
 *
 * @param p1 el primer punto a evaluar
 * @param p2 el segundo punto a evaluar
 * @return true si los tres puntos están alineados, false en caso contrario
 */
  public boolean estanAlineados(Punto p1, Punto p2){
    return  ((p1.getY()-y)*(p2.getX()-p1.getX())) == ((p2.getY()- p1.getY())*(p1.getX()- x));
  }
  /**
  * Obtiene la coordenada X del punto.
  *
  * @return La coordenada X.
  */
  public double getX (){
    return x;
  }
  /**
  * Obtiene la coordenada Y del punto.
  *
  * @return La coordenada Y.
  */
  public double getY (){
    return y;
  }
  /**
  * Modifica la coordenada X del punto.
  *
  * @param x1 Nuevo valor para la coordenada X.
  */
  public void setX(double x1){
    x=x1;
  }
  /**
  * Modifica la coordenada Y del punto.
  *
  * @param y1 Nuevo valor para la coordenada Y.
  */
  public void setY(double y1){
    y=y1;
  }

  public boolean equals(Object p){
    if (this == p) return true;
    if (p == null || getClass() != p.getClass()) return false;
    Punto punto = (Punto) p;
    return x == punto.getX() && y == punto.getY();

  }

  public String toString(){
    return "(" + x + "," + y + ")";
  }
}
