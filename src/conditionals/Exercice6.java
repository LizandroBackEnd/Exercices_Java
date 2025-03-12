package conditionals;
import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = 0, altura = 0;

        while (true) {
            System.out.println("Ingrese la base del rectangulo: ");
            if (sc.hasNextDouble()) {
                base = sc.nextDouble();
                if (base > 0) {
                    break;
                } else {
                    System.out.println("La base debe ser un numero positivo");
                }
            } else {
                System.out.println("Ingrese un numero  valido");
                sc.next();
            }
        }

        while (true) {
            System.out.println("Ingrese la altura del rectangulo: ");
            if (sc.hasNextDouble()) {
                altura = sc.nextDouble();
                if (altura > 0) {
                    break;
                } else {
                    System.out.println("La altura debe ser un numero positivo");
                }
            } else {
                System.out.println("Ingrese un numero  valido");
                sc.next();
            }
        }

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
