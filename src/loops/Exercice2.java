package loops;
import java.util.Scanner;

public class Exercice2 {

    // Methods
    public static String RegisterUser(String UserName, int UserAge) {
        return "The user " + UserName + " has been registered with age " + UserAge;
    }
    public static int CreatePin(int pin ) {
        String pinString = Integer.toString(pin);

        if (pinString.length() != 4) {
            System.out.println("Please enter a valid pin");
            return -1;
        }
        return pin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, msg="";
        int age, pin;

        System.out.println("Hello welcome, enter your name");
        name = sc.nextLine().toUpperCase().trim();
        System.out.println("What is your age?");
        age = sc.nextInt();

        System.out.println(RegisterUser(name, age));

        System.out.println("The user " + name + " must create their PIN");
        pin = sc.nextInt();

        System.out.println("Your new pin is " + CreatePin(pin));



    }

}
