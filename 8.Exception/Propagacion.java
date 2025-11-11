public class Propagacion{

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }

    static void metodo1() throws Exception {
        metodo2();
    }

    static void metodo2() throws Exception {
        metodo3();
    }

    static void metodo3() throws Exception {
        // Aquí se lanza la excepción
        throw new Exception("Error en método 3");
    }
}
