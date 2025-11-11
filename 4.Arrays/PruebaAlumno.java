public class PruebaAlumno{
  public static void main(String[] args) {

    Alumno alumn = new Alumno ("Cris","Direccion de Cris", "5534435445" , 10);

    alumn.asignarCalificaciones();

    System.out.println("La mayor calificacion de " + alumn.getNombre() + "es "
    + alumn.mayorCalificacion());

    System.out.println("El promedio es " + alumn.promedio());

    if(alumn.buscarCurso(6) != -1){
      System.out.println("El curso con 6 es " + alumn.buscarCurso(6));
    }else{
      System.out.println("No tienes ni un 6 :D");
    }

    int [] ex = alumn.todosLosDieces();
    for(int i =1; i<=ex[0]; i++){
      System.out.println(ex[i] + " ");
    }

  }
}
