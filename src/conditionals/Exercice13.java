package conditionals;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 42;

        if (num % 2 == 0) {
            int res = num / 2;
            System.out.println("El numero " + num + " es par, divido entre dos es " + res);
        } else {
            int res = num * 3 + 1;
            System.out.println("El numero " + num + " es impar, multiplicado por 3 y sumando 1 es " + res);

        }

        //Adicional
        double num2, res2;

        System.out.println("Cual es el numero a evaluar");
        num2 = sc.nextDouble();

        if (num2 % 2 == 0) {
            res2 = num2 / 2;
            System.out.println("El numero " + num2 + " es par, divido entre dos es " + res2);
        } else {
            res2 = num2 * 3 + 1;
            System.out.println("El numero " + num2 + " es impar, multiplicado por 3 y sumando 1 es " + res2);

        }
    }
}
