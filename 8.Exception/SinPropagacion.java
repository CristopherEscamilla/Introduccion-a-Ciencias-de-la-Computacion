public class SinPropagacion {

    public static void main(String[] args) {
        metodo1();
        System.out.println("Programa finalizado correctamente.");
    }

    static void metodo1() {
        metodo2();
    }

    static void metodo2() {
        metodo3();
    }

    static void metodo3() {
        try {

            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado en metodo3: " + e.getMessage());
        }

        System.out.println("Continuando ejecución en metodo3 después del try-catch...");
    }
}
