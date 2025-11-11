class Animal {
    void hacerSonido() throws Exception {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() throws Exception {
        throw new Exception("El perro ladra demasiado fuerte!");
    }
}

public class EjemploHerencia {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        try {
            miPerro.hacerSonido(); // Llama al método de la subclase
        } catch (Exception e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }
}


class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        try {
            int x = 10 / 0; // Causa una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error manejado dentro de Perro: " + e.getMessage());
        }
    }
}

public class EjemploSinPropagacion {
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        miPerro.hacerSonido();
        System.out.println("El programa continúa sin errores.");
    }
}
