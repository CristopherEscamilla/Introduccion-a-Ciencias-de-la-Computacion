import java.util.Scanner;
public class UsaCuentas {

  static Scanner in = new Scanner(System.in);
  static CuentaConServicios cuenta;

  public static void menu () {

    System.out.println("1. Retirar capital");
    System.out.println("2. Depositar capital");
    System.out.println("3. Consultar disponible");
    System.out.println("4. Pagar teléfono");
    System.out.println("0. Terminar");}

    public static double cantidadValida (String mensaje) {
    double cantidad;
    do{
      System.out.println(mensaje);
      cantidad=in.nextDouble();

    } while (cantidad <= 0);
    return cantidad;
  }

  public static void realizarAccion(int opcion) {
  double capital;
  switch(opcion){
    case 1:
    capital =cantidadValida("¿Cuánto dinero quieres retirar?");
    cuenta.retirar(capital);
    break;

    case 2:
    capital = cantidadValida("¿Qué cantidad deseas depositar?");
    cuenta.depositar(capital);
    break;

    case 3:
    System.out.println("Tu saldo disponible es $" + cuenta.obtenerDisponible());
    break;

    case 4:
    capital = cantidadValida("Cuanto dinero vas a pagar?");
    cuenta.pagarTelefono("12345",capital);
    System.out.println("Telefono pagado gracias");
    break;

    case 0:
    System.out.println("Hasta pronto");

    default:
    System.out.println("Opcion inválida");
    }
  }

    public static void main(String[] pps){
      int opcion;
      double capital = cantidadValida("Con cuanto quieres iniciar tu cuenta");
      while(capital < 2500)
        capital = cantidadValida("La cantidad minima es de 2500"+
                                 "\nIndica de nuevo la cantidad");

      cuenta = new CuentaConServicios(capital,123123123);
      do{
        menu();
        opcion = in.nextInt();
        realizarAccion(opcion);
      } while (opcion != 0);
    }
  }
