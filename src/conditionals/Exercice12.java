package conditionals;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el monto del prestamo");
        double mntPrestamo = sc.nextDouble();

        System.out.println("Cual es la tasa de interes anual en porcentaje");
        double tsInAnualpj = sc.nextDouble();
        double tsInAnual = tsInAnualpj / 100;

        System.out.println("Cual es el plazo en meses");
        int plzMeses = sc.nextInt();

        if (plzMeses > 60){
            tsInAnual =+ 0.01;
        }

        double tsInMes = tsInAnual / 12;
        double pagoMes = (mntPrestamo * tsInMes) / (1 -Math.pow(1 + tsInMes, -plzMeses));
        System.out.println("El pago mensual es: " + pagoMes);
    }
}
