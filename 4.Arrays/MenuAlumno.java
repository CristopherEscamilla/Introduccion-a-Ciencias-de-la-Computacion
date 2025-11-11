import  java.util.*;
import  java.io.*;
public class MenuAlumno{
  static Alumno alumnoPrueba = null;
  static Scanner in = new Scanner(System.in);

  private static void menu(){
    System.out.println("Menu para probar alumnos \n");
    System.out.println("1. Crear Alumno");
    System.out.println("2. Asignar Calificaciones");
    System.out.println("3. Calcular el promedio");
    System.out.println("4. Indicar la calificacion mas alta");
    System.out.println("5. Indicar el curso con la calificacion especificada");
    System.out.println("0. Cerrar programa");
    System.out.println("\n Elige una opcion");
  }

  private static void realizaAccion(int opcion){
    switch(opcion){
      case 0:
      break;
      case 1:
      System.out.println("Dame el nombre del alumno");
      in.nextLine();
      String nombre = in.nextLine();
      System.out.println("Dar la dirreccion del alumno");
      String dir = in.nextLine();
      System.out.println("Dar telefono del alumno");
      String tel = in.nextLine();
      System.out.println("Dar el numero de calificaciones del alumno");
      int cals = in.nextInt();
      alumnoPrueba = new Alumno(nombre,dir,tel,cals);
      break;

      case 2:
      if(alumnoPrueba == null){
        System.out.println("No se ha dado de alti ni un alumno");
      }else{
        alumnoPrueba.asignarCalificaciones();
      }
      break;
      case 3:
      if(alumnoPrueba ==null){
        System.out.println("No se ha dado de alti ni un alumno");
      }else{
        System.out.println("El promedio del alumno " + alumnoPrueba.getNombre() + "es "
        + alumnoPrueba.promedio());
      }
      break;
      case 4:
      if(alumnoPrueba ==null){
        System.out.println("No se ha dado de alti ni un alumno");
      }else{
        System.out.println("La mayor calificacion de " + alumnoPrueba.getNombre() + "es "
        + alumnoPrueba.mayorCalificacion());
      }
      break;
      case 5:
      if(alumnoPrueba ==null){
        System.out.println("No se ha dado de alti ni un alumno");
      }else{
        System.out.println("Dar la calificacion");
        int cal = in.nextInt();
        int curso = alumnoPrueba.buscarCurso(cal);
        if(curso != -1){
          System.out.println("El alumno " + alumnoPrueba.getNombre() +
                              "tiene " + cal + "En el curso " + curso);
        }else{
          System.out.println("El alumno " + alumnoPrueba.getNombre() +
                              "no tiene curso con " + cal );
        }
      }
      break;

      default:
        System.out.println("Opcion Incorrecta");
        break;
    }
  }

  public static void main(String[] args) {
    int opcion;
    do{
      menu();
      opcion = in.nextInt();
      realizaAccion(opcion);
    }while(opcion != 0);
  }
}
