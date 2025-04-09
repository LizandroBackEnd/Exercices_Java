package mastermind;
import java.util.Scanner;

public class DrHouse {

    public static String pregunta(String p) {
        Scanner sc = new Scanner(System.in);
        System.out.println(p);
        String respuesta = sc.nextLine().toUpperCase();
        return respuesta;
    }

    public static void departamentoTrauma(String nombre) {
        System.out.println("A departamento de traumatologia ");
    }
    public static void departamentoEsto(String nombre) {
        System.out.println("A departamento de estologia ");
    }
    public static void departamentoCardio(String nombre) {
        System.out.println("A departamento de cardiologia ");
    }

    public static void triaje(String nombre ){
        String resp = "";
        System.out.println("Hola paciente: " + nombre + ", soy en doctor House");

        resp = pregunta("Paciente: " + nombre + " ha tenido alguna caída: [S/N]");
        while(!resp.equals("S") && !resp.equals("N") ) {
            System.out.println("Me esta haciendo perder el tiempo");
            resp = pregunta("Paciente: " + nombre + " ha tenido alguna caída: [S/N]");
        }
        if (resp.equals("S")) {
            departamentoTrauma(nombre);
        } else if (resp.equals("N")) {
            resp = pregunta("Paciente: " + nombre + " le duele el pecho: [S/N]");
            while (!resp.equals("S") && !resp.equals("N")) {
                System.out.println("Solo se lo preguntare una vez más");
                resp = pregunta("Paciente: " + nombre + " le duele el pecho: [S/N]");
            }
            if (resp.equals("S")) {
                departamentoCardio(nombre);
            } else if (resp.equals("N")) {
                resp = pregunta("Paciente: " + nombre + " le duele el estomago: [S/N]");
                while (!resp.equals("S") && !resp.equals("N")) {
                    System.out.println("Le pregunto por ultima vez");
                    resp = pregunta("Paciente: " + nombre + " le duele el estomago: [S/N]");
                }
                if (resp.equals("S")) {
                    departamentoEsto(nombre);
                } else if (resp.equals("N")) {
                    System.out.println("Me hace perder el tiempo vayase a casa");
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola paciente: ¿Cual es su nombre?");
        String nombre = sc.nextLine().toUpperCase();
        triaje(nombre);
    }
}
