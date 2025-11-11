public class CuentaDeCredito extends Cuenta{
  private double limiteCredito;

  public CuentaDeCredito(double credito,long cuenta){
    super(credito,cuenta);
    limiteCredito = credito;
  }

  public double obtenerMontoDeuda(){
    return limiteCredito - disponible;
  }

  public void comprar (double monto){
    if(monto > 0.0 && monto < disponible){
      disponible -= monto;
    }else{
      System.out.println("Credito insuficiente");
    }
  }

  public void retirar (double monto){
    if(monto > 0.0 && monto <= disponible){
      double comision = monto * .02;
      super.retirar(monto + comision);
    }else System.out.println("No puedes retirar esa cantidad");
  }

  public void depositar(double monto){
    super.depositar(monto);
    if(obtenerMontoDeuda() < 0.0){
      double gratificacion = Math.abs(limiteCredito - disponible);
      super.retirar(monto);
      super.depositar(monto+gratificacion);
    }
  }

  public double obtenerImporteDeuda(){
    return limiteCredito - disponible;
  }

}
