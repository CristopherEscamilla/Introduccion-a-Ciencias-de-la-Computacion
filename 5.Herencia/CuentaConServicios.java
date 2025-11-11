public class CuentaConServicios extends Cuenta{
  public CuentaConServicios(double montoInicial,long cuenta){
    super(montoInicial,cuenta);
  }
  public void pagarTelefono(String numTel, double monto){
    retirar(monto);
    disponible += 100;
  }
}
