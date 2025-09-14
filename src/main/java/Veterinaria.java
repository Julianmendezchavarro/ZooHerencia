public class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void atender(Animal a) {
        System.out.println("Atendiendo en consultorio: " + consultorio.getUbicacion());
        a.sonido();
    }
}
