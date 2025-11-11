class Gato extends AnimalDomestico implements Sonido {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Soy un gato ");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}
