package src.modulos;
/**
* Clase que representa un carro con atributos de color, motor y ruedas.
* Permite crear instancias de carros con valores por defecto o personalizados,
* además de modificar y consultar sus propiedades.
*
* @author  Cristopher Escamilla
* @version 1.0
*/
public class Carro{
  //Color del carro
  String color;
  //Modelo del motor
  String motor;
  //Número de ruedas, constante para todos los carros
  final int RUEDAS = 4;
  /**
  * Constructor por defecto.
  * Inicializa el carro con color "Amarillo" y motor "F100".
  */
  public Carro(){
    color = "Amarillo";
    motor = "F100";
  }
  /**
  * Constructor con parámetros.
  *
  * @param color Color del carro.
  * @param motor Modelo del motor del carro.
  */
  public Carro(String color,String motor){
    // Usamos "this" para diferenciar el atributo de la clase (this.color)
    // del parámetro del método (color). Sin "this", Java no sabría a cuál te refieres.
    this.color = color;
    // Usamos "this" para diferenciar el atributo de la clase (this.motor)
    // del parámetro del método (motor). Sin "this", Java no sabría a cuál te refieres.
    this.motor = motor;
  }
  /**
  * Obtiene el color del carro.
  *
  * @return El color del carro.
  */
  public String getColor (){
    return color;
  }
  /**
  * Obtiene el modelo del motor del carro.
  *
  * @return El modelo del motor.
  */
  public String getMotor (){
    return motor;
  }
  /**
  * Obtiene el número de ruedas del carro.
  *
  * @return El número de ruedas (constante = 4).
  */
  public int getRueditas (){
    return RUEDAS;
  }
  /**
  * Modifica el color del carro.
  *
  * @param colorsito Nuevo color a asignar al carro.
  */
  public void setColor(String colorsito){
    color=colorsito;
  }
  /**
  * Modifica el modelo del motor del carro.
  *
  * @param motor Nuevo modelo de motor a asignar.
  */
  public void setMotor(String motor){
    this.motor= motor;
  }


}
