import java.math.*;
public class Cuenta{
  protected double disponible;
  private static int num = 2025;
  private final long numCuenta;

  public Cuenta (double montoInicial,long numCuenta){
    disponible = Math.abs(montoInicial);
    this.numCuenta = numCuenta;
  }

  public void depositar(double monto){
    disponible += monto;
  }

  public void retirar(double monto){
    disponible -= monto;
  }

  public double obtenerDisponible(){
    return disponible;
  }

  public double obtenerNumCuenta(){
    return numCuenta;
  }

}
