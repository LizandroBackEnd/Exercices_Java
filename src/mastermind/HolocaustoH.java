package mastermind;

public class HolocaustoH {
    public static void main (String [] args) {
        Posicion posInicial = new Posicion();
        posInicial.setX(3);
        posInicial.setY(0);

        // Generaremos los dos primeros objetos
        Habitacion hab1 = new Habitacion();
        Personaje jugador = new Personaje();
        jugador.setPos(posInicial);
    }
}
