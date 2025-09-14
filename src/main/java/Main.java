public class Main {
    public static void main(String[] args) {
        // Herencia y composición
        Collar collar = new Collar("Cuero rojo");
        Perro perro = new Perro("Rocky", collar);
        Gato gato = new Gato("Misu");

        perro.sonido();
        perro.mostrarCollar();
        gato.sonido();

        // Veterinaria y consultorio
        Consultorio consultorio = new Consultorio("Calle 123");
        Veterinaria vet = new Veterinaria(consultorio);
        vet.atender(perro);
        vet.atender(gato);

        // Genéricos
        Caja<Animal> cajaAnimal = new Caja<>();
        cajaAnimal.guardar(gato);
        System.out.println("Animal en caja: " + cajaAnimal.obtener().nombre);

        // Casting
        Animal a = new Perro("Max", collar);
        if (a instanceof Perro) {
            Perro p = (Perro) a;
            p.mostrarCollar();
        }
    }
}
