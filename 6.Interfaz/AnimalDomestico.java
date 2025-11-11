
// Clase abstracta: comparte atributos y comportamiento común
abstract class AnimalDomestico {
    protected String nombre;

    public AnimalDomestico(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Mi nombre es " + nombre);
    }

    // Método abstracto (puede ser distinto en cada animal)
    abstract void tipoAnimal();
    
}
