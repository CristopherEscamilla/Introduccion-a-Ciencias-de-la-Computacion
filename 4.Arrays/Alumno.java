import  java.util.*;
import java.io.*;
public class Alumno {
 private final String nombre;
 private String direccion;
 private String telefono;
 private final String numRegistro;
 private static int folio = 2010;
 private int [] calificaciones;

 public Alumno(String n, String d, String t, int nCalf){
   nombre = n.trim();
   direccion = d.trim();
   telefono = t.trim();
   numRegistro = "UNAM-" + folio++;
   calificaciones = new int[(nCalf > 0) ? nCalf :15];
 }

 public String getNombre(){
   return nombre;
 }
 public int obtenerNumCalificaciones(){
   return calificaciones.length;
 }

 public void asignarCalificacion(int curso,int cal){
   if(curso >= 0 && curso < calificaciones.length){
     if(cal >= 0 && cal <= 10){
       calificaciones[curso] = cal;
     }else{
       new Error("Calificacion Incorrecta");
     }
   }else{
     new Error("Nuero de curso Incorrecto");
   }
 }

 public void asignarCalificaciones(){
   Scanner in = new Scanner(System.in);
   int cal;
   for(int i = 0; i < calificaciones.length; i++){
     do{
       System.out.println("Dar la calificacion para el curso" + (i + 1) + " ");
       cal = in.nextInt();
     }while(cal<0 || cal > 10);
     asignarCalificacion(i,cal);
   }
 }

 public double promedio(){
   double suma = 0;
   for(int i = 0; i < calificaciones.length; i++){
     suma += calificaciones[i];
   }
   return suma/calificaciones.length;
 }

 public int mayorCalificacion(){
   int mayor = calificaciones[0];
   for(int i = 1; i < calificaciones.length; i++){
     if(calificaciones[i] > mayor){
       mayor = calificaciones[i];
     }
   }
   return mayor;
 }
 public int buscarCurso(int cal){
   int i = 0;
   while((i<calificaciones.length) && (calificaciones[i] != cal)){
     i++;
   }
   return (i == calificaciones.length) ? -1 : i+1;
 }

 public int[] getCalificaciones(){
   return calificaciones;
 }

 public int [] todosLosDieces(){
   int j = 0;
   int [] dieces = new int[calificaciones.length+1];
   for(int i = 0; i < calificaciones.length; i++){
     if(calificaciones[i] == 10){
       dieces[++j]=i;
     }
   }
   dieces[0] = j;
   return  dieces;
 }

}
