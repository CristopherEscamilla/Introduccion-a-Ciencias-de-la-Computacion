public class Main {
    public static void main(String[] args) {
        Perro pe = new Perro("Firulais");
        Gato ga = new Gato("Michi");

        pe.mostrarNombre();
        pe.tipoAnimal();
        pe.hacerSonido();

        System.out.println();

        ga.mostrarNombre();
        ga.tipoAnimal();
        ga.hacerSonido();

        //Sonido so = new Perro("Firulais");
        //so.hacerSonido();
        // s.mostrarNombre();

        AnimalDomestico a = new Perro("Firulais");
        a.mostrarNombre();
        a.tipoAnimal();
        


    }
}
