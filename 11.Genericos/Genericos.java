public class Genericos{
public static void main(String[] args) {


        System.out.println("=== USO DE CLASE GENÉRICA ===");

        // Contenedor con String
        Contenedor<String> contenedorString = new Contenedor<>("Hola Mundo");
        contenedorString.mostrarTipo();
        System.out.println(contenedorString.getElemento());

        // Contenedor con Integer
        Contenedor<Integer> contenedorInteger = new Contenedor<>(42);
        contenedorInteger.mostrarTipo();
        System.out.println(contenedorInteger.getElemento());

        // Contenedor con Double
        Contenedor<Double> contenedorDouble = new Contenedor<>(3.1416);
        contenedorDouble.mostrarTipo();
        System.out.println(contenedorDouble.getElemento());

        System.out.println("\n=== USO DE MÉTODOS GENÉRICOS ===");

        // Usando métodos genéricos
        Utilidades.imprimirElemento("Texto de ejemplo");
        Utilidades.imprimirElemento(100);
        Utilidades.imprimirElemento(45.67);

        // Método con array
        String[] frutas = {"Manzana", "Banana", "Naranja"};
        String primeraFruta = Utilidades.obtenerPrimero(frutas);
        System.out.println("Primera fruta: " + primeraFruta);

        Integer[] numeros = {10, 20, 30};
        Integer primerNumero = Utilidades.obtenerPrimero(numeros);
        System.out.println("Primer número: " + primerNumero);

        // Método con múltiples tipos
        System.out.println("\nComparando tipos:");
        Utilidades.compararTipos("Texto", 123);
        Utilidades.compararTipos(45.6, 78.9);

        // Método con restricción
        System.out.println("\nSuma con restricción numérica:");
        double resultado1 = Utilidades.sumar(10, 20);
        System.out.println("10 + 20 = " + resultado1);

        double resultado2 = Utilidades.sumar(5.5, 3.2);
        System.out.println("5.5 + 3.2 = " + resultado2);

        // Esto daría error de compilación:
        // Utilidades.sumar("a", "b"); // Error: String no extiende Number
    }
}
