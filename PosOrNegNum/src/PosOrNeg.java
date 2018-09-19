import java.util.Scanner;

public class PosOrNeg {

    public static void main(String[] args) {

        System.out.print("Enter your number: ");

        Scanner inp = new Scanner(System.in);

        int number = inp.nextInt();

        if (number < 0) {
            System.out.println("Number " + number + " is negative.");
        }
        else {
            System.out.println("Number " + number + " is positive.");
        }
    }
}
