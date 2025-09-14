public class Perro extends Animal {
    private Collar collar;

    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("El perro " + nombre + " ladra.");
    }

    public void mostrarCollar() {
        if (collar != null) {
            System.out.println("Collar de perro: " + collar.getDescripcion());
        } else {
            System.out.println("El perro no tiene collar.");
        }
    }
}
