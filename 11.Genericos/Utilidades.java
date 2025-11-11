public class Utilidades {

    // Método genérico estático
    public static <T> void imprimirElemento(T elemento) {
        System.out.println("Elemento: " + elemento);
        System.out.println("Tipo: " + elemento.getClass().getSimpleName());
    }

    // Método genérico que retorna un valor
    public static <T> T obtenerPrimero(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[0];
    }

    // Método genérico con múltiples parámetros de tipo
    public static <T, U> void compararTipos(T elemento1, U elemento2) {
        System.out.println("Tipo 1: " + elemento1.getClass().getSimpleName());
        System.out.println("Tipo 2: " + elemento2.getClass().getSimpleName());
        System.out.println("¿Son del mismo tipo? " +
            elemento1.getClass().equals(elemento2.getClass()));
    }

    // Método genérico con restricción (bounded type parameter)
    public static <T extends Number> double sumar(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
