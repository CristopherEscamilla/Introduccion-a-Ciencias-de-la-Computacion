import java.io.*;
import java.util.*;

/**
* Clase {@code DisparoExcepciones} que demuestra el uso de excepciones en Java,
* incluyendo el lanzamiento de excepciones genéricas y personalizadas, así como
* el uso de bloques {@code try-catch-finally}.
*
* <p>Este ejemplo representa operaciones bancarias básicas (depósito y retiro)
* donde se controlan errores comunes como montos negativos, saldo insuficiente
* o valores iniciales inválidos.</p>
*
* <p>Incluye una excepción personalizada llamada
* {@code ExceptionBancariaNegativo}, que debe estar definida en otra clase.</p>
*
* @author
*     Cristopher Escamilla
* @version
*     2025-2
* @since
*     Java 8
*/
public class DisparoExcepciones{
  /** Saldo actual de la cuenta bancaria. */
  static double saldo = 2600;
  static Scanner in = new Scanner(System.in);
  /**
  * Constructor que valida el saldo inicial de la cuenta.
  *
  * @param saldo Monto inicial de la cuenta.
  * @throws IllegalArgumentException si el saldo inicial es menor o igual a 2500.
  */
  public DisparoExcepciones (double saldo){
    if(saldo<=2500){
      throw new IllegalArgumentException("El monto inicial debe ser mayor a 2500");
    }
    this.saldo += saldo;
  }
  /**
  static void depositar(double monto) throws Exception {
    if(monto < 0){
      throw new Exception("Deposito incorrecto");
    }
    saldo += monto;
  }

  */
  /**
  *  Realiza un depósito en la cuenta.
  *
  * @param monto Monto a depositar (debe ser positivo).
  * @throws ExceptionBancariaNegativo si el monto es negativo.
  */
  static void depositar(double monto) throws ExceptionBancariaNegativo {
    if(monto < 0){
      throw new ExceptionBancariaNegativo("El monto no puede ser negativo");
    }
    saldo += monto;
  }

  /**
  * Retira un monto de la cuenta.
  *
  * @param monto Monto a retirar (debe ser positivo y menor o igual al saldo).
  * @return El saldo restante después del retiro.
  * @throws Exception si el monto es negativo o si el saldo es insuficiente.
  */
  static double retirar(double monto) throws Exception{
    if(monto <= 0){
      throw new Exception("No es positivo");
    }
    if(monto > saldo){
      throw new Exception("Saldo insuficiente");
    }
    if(saldo < monto){
      saldo -= monto;
      return saldo;
    }
      return saldo;
    }

    /**
    * Método principal que demuestra el uso de excepciones en operaciones bancarias.
    *
    */
    public static void main(String[] args) {
      //System.out.println(3/0);

      try{System.out.println("Cuanto quieres depositar");
        double monto = in.nextDouble();
        depositar(monto);
      }catch(Exception e){
        System.out.println("error01" + e.getMessage());
      }


      try{
        DisparoExcepciones ejemplo = new DisparoExcepciones(saldo);
      }catch(Exception e){
        System.out.println("errorr" + e.getMessage());
      }
      finally{
        System.out.println("==========Uso de ExceptionBancaria========");
      }
      System.out.println("Tu salfo final ahora es de: " + saldo);


    }
}
