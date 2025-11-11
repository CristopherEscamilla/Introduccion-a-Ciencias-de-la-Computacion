import java.time.LocalDate;
import java.io.*;
import java.util.*;

/**
 * Este programa contiene un método que, dado un día, mes y año,
 * devuelve el nombre del día de la semana correspondiente usando
 * la clase {LocalDate} de la API de Java 8.
 *
 * Utiliza {LocalDate.of(year, month, day)} para construir la fecha
 * y luego {getDayOfWeek().toString()} para obtener el día de la semana.
 *
 * Este programa es útil para trabajar con fechas sin tener que lidiar con
 * calendarios manualmente.
 *
 * @author Cristopher Escamilla
 * @version 1.0
 * @see java.time.LocalDate
 * @see java.time.DayOfWeek
 */
 class DateTime{
   public static String findDay(int month, int day, int year) {
     LocalDate date = LocalDate.of(year, month, day);
     return date.getDayOfWeek().toString();
   }

   /**
    *Calendar calendar = Calendar.getInstance();
    *calendar.set(Calendar.YEAR, year);
    *calendar.set(Calendar.MONTH, month - 1);
    *calendar.set(Calendar.DAY_OF_MONTH, day);

    * return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
    */
   public static void main(String[] args) {
     String s = findDay(8,28,25);
     System.out.println(""+s);
   }


 }
