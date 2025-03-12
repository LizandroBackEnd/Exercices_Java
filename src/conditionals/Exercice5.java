package conditionals;
import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dia de la semana");
        String dia = sc.nextLine().trim().toLowerCase();

        System.out.println("Cual es el precio original del producto");
        double precio = sc.nextDouble();

        double descuento = 0.0;

        switch (dia) {
            case "lunes":
                descuento = 0.10;
                break;
            case "miercoles":
                descuento = 0.20;
                break;
            case "viernes":
                descuento = 0.15;
                break;
            default:
                descuento = 0.0;
                break;
        }
        double precioFinal = precio * (1 - descuento);
        System.out.println("El precio del producto es " + precioFinal);
    }
}
