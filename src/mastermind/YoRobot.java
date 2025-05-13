package mastermind;

public class YoRobot {
    //Propiedades
    private double peso;

    public YoRobot () {}

    //Getters & Setters
    public void setPeso(double p) {
        if (p < 0) peso = 0;
        else peso = p;
    }

    public double getPeso() {
        return peso;
    }
}
