package loops;

public class Exercice9 {

    /* Funciones vacias en estas hace calculos más no se devuelve nada aunque se le pasen parametros  */
    public static void CalculoProductos(float precioUn, int uni) {
        float precioT = precioUn * uni;
        System.out.println("PRECIO DE LOS PRODUCTOS: " + precioT);
    }

    public static void main (String[] args) {
        CalculoProductos(120.3f, 4);
    }
}
