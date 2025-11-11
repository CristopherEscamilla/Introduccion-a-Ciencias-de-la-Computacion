import java.util.*;
public class PruebaCuentas{
  static Scanner in = new Scanner(System.in);
  static Cuenta cuenta = null;

  public static void menu (){
    System.out.println("1. Crear Cuenta");
    System.out.println("2. Retirar capital");
    System.out.println("3. Depositar capital");
    System.out.println("4. Consultar disponible");
    System.out.println("5. Pago de servicios");
    System.out.println("6. Comprar a credito");
    System.out.println("0. Terminar");
  }
  public static double cantidadValida (String mensaje) {
  double cantidad;
  do{
    System.out.println(mensaje);
    cantidad=in.nextDouble();

  } while (cantidad <= 0);
  return cantidad;
  }
  public static void realizarAccion(int opcion){
    double capital;
    switch(opcion){
      case 1:
      System.out.println("Especifica el tipo de cuenta que quieres crear");
      System.out.println("1. Debito");
      System.out.println("2. Credito");
      System.out.println("3. Con pago a servicios");
      int eleccion = in.nextInt();
      switch(eleccion){
        case 1:
        do{
          System.out.println("Introduce tu deposito inicial");
          capital = in.nextDouble();
        }while (capital < 2500);
        cuenta = new Cuenta(capital,314343434);
        break;
        case 3:
        do{
          System.out.println("Introduce tu deposito inicial");
          capital = in.nextDouble();
        }while(capital < 2500);
        cuenta = new CuentaConServicios(capital,314343434);
        break;
        case 2:
        System.out.println("Tu limite de credito es de 5000");
        cuenta = new CuentaDeCredito(5000,314343434);
        break;
        default: System.out.println("No existe ese tipo de cuentas");
      }
      break;
      case 2:
      System.out.println("Indica la cantidad que deseas retirar");
      capital = in.nextDouble();
      cuenta.retirar(capital);
      break;

      case 3:
      System.out.println("Indica la cantidad que deseas depositar");
      capital=in.nextDouble();
      cuenta.depositar(capital);
      break;

      case 4:
      cuenta.obtenerDisponible();
      System.out.println("Tu disponible es de:$" + cuenta.obtenerDisponible());
      break;

      case 5:
      if(cuenta instanceof CuentaConServicios){
        CuentaConServicios cs =(CuentaConServicios) cuenta;
        capital = cantidadValida("Indica la cantidad a pagar en tu cuenta telefonica");
        cs.pagarTelefono("5511223344",capital);
        cuenta = cs;
      }else System.out.println("Tu cuenta no tiene habilitado ese servicio");
      break;

      case 6:
      if(cuenta instanceof CuentaDeCredito){
        CuentaDeCredito cc = (CuentaDeCredito) cuenta;
        capital = cantidadValida("Cuanto vas a comprar");
        cuenta = cc;

      }else System.out.println("Tu cuenta no tiene habilitado este servicio");
      break;

      }
  }


      public static void main(String[] pps){
        int opcion;
        do{
          menu();
          opcion = in.nextInt();
          realizarAccion(opcion);
        } while (opcion != 0);
      }


}
