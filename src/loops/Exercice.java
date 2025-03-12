package loops;
import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paswd = "liz1178", passUser;
        int i = 0;
        boolean access = false;

        do {
            System.out.println("Enter your password");
            passUser = sc.nextLine();

            if (passUser.equals(paswd)) {
                access = true;
                System.out.println("Correct password!!");
                break;
            } else {
                System.out.println("Wrong password!!");
            }
            if (i == 3) {
                System.out.println("Please try again later");
            }
        } while (i < 3);
        if (access){
            System.out.println("Congratulations! You are now logged in!");
        }
        sc.close();
    }
}
