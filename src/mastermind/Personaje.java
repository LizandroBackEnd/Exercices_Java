package mastermind;

public class Personaje {
    private String nombre;
    private Posicion pos;

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Posicion getPos() {
        return pos;
    }
    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    public Personaje () {
        System.out.println("Creacion de un Personaje");
    }
}
