package mastermind;

public class Habitacion {
    Posicion puertaEntrada;

    public Habitacion() {
        System.out.println("Creacion de una Habitacion");
    }

    //Getters and Setters
    public Posicion getPuertaEntrada() {
        return puertaEntrada;
    }
    public void setPuertaEntrada(Posicion puertaEntrada) {
        this.puertaEntrada = puertaEntrada;
    }
}
