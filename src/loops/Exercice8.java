package loops;

public class Exercice8 {
    public static void main(String[] args) {
        int width = 5;
        int height = 7;

        for (int rows = 1; rows <= height; rows++) {;
            for (int cols = 1; cols <= width; cols++) {
                if (cols == 1 && rows != 8) System.out.println("*");
            }
        }
    }
}
