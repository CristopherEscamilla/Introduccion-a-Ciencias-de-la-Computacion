class Perro extends AnimalDomestico implements Sonido {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Soy un perro ");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}
