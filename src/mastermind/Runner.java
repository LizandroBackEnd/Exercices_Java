package mastermind;
import java.util.Scanner;

public class Runner {
    public static int mostrarMenu (boolean error) {
        Scanner sc = new Scanner(System.in);
        if (error) System.out.println("Introduce unicamente un valor [0,1,2,3]");
        System.out.println("----------Menu----------");
        System.out.println("[0] Finalizar");
        System.out.println("[1] Nuevo dato");
        System.out.println("[2] Mostrar datos");
        System.out.println("[3] Borrar ultimo dato");
        System.out.println("------------------------");
        System.out.print("Tu opcion [0,1,2,3]->");
        int resp = sc.nextInt();
        while (resp < 0 || resp > 3) resp = mostrarMenu(true);
        return resp;
    }

    public static void nuevoRegistro (double d[], int uR) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nuevo registro");
        double nuevoDato = sc.nextDouble();
        d[uR] = nuevoDato;
    }

    public static void mostrarRegistros (double d[], int uR) {
        System.out.println("----------Datos----------");
        for (int i = 0; i < uR; i++) {
            System.out.println("Dato [" + i + "] : " + d[i]);
        }
        System.out.println("-------------------------");
    }

    public static int eliminarRegistro (double t[], int uR) {
        if (uR == 0) {
            System.out.println("No hay datos para eliminar");
            return uR;
        }
        System.out.println("Se va a eliminar el ultimo dato" + t[uR - 1]);
        t[uR -1 ] = 0.0;
        return uR;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tiempos [] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        double distancias [] = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
        int ultRegistro = 0;



        System.out.println("A que seccion desea ingresar [1: tiempos], [2: distancias]");
        int seccion = sc.nextInt();
        switch (seccion) {
            case 1:
                int resp = -1;
                resp = mostrarMenu(false);
                while (resp!=0) {
                    switch (resp) {
                        case 1:
                            nuevoRegistro(tiempos, ultRegistro);
                            ultRegistro++;
                            break;
                        case 2:
                            mostrarRegistros(tiempos, ultRegistro);
                            break;
                        case 3:
                            eliminarRegistro(tiempos, ultRegistro);
                            break;
                    }
                    resp = mostrarMenu(false);
                }
                break;
            case 2:
                resp = mostrarMenu(false);
                while (resp!=0) {
                    switch (resp) {
                        case 1:
                            nuevoRegistro(distancias, ultRegistro);
                            ultRegistro++;
                            break;
                        case 2:
                            mostrarRegistros(distancias, ultRegistro);
                            break;
                        case 3:
                            eliminarRegistro(distancias, ultRegistro);
                            break;
                    }
                    resp = mostrarMenu(false);
                }
                break;
            default:
                System.out.println("Valor no valido");
        }


    }

}
