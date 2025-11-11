// Clase genérica que puede trabajar con cualquier tipo de dato
public class Contenedor<T> {
    private T elemento;

    // Constructor
    public Contenedor(T elemento) {
        this.elemento = elemento;
    }

    // Getter
    public T getElemento() {
        return elemento;
    }

    // Setter
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    // Método que muestra el tipo del elemento
    public void mostrarTipo() {
        System.out.println("Tipo del elemento: " + elemento.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Contenedor{" + "elemento=" + elemento + '}';
    }
}
