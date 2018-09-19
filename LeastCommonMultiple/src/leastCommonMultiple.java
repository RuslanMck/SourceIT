import java.util.Scanner;

public class leastCommonMultiple {

    public static void main(String[] args) {

        System.out.println("Enter two numbers, that positive and bigger that null:");

        Scanner input01 = new Scanner(System.in);

        int a = input01.nextInt();
        int b = input01.nextInt();

        if (a <= 0 | b <= 0) {
            System.out.println("One of your number is less or equal to zero. Please enter correct numbers.");
            return;
        }

        int min = a > b ? b : a;
        int max = a < b ? b : a;

        while (max % min != 0) {
            int result = max % min;
            max = min;
            min = result;
        }

        System.out.println("Greatest common divisor = " + min);

        int lcm = a * b / min;
        System.out.println("Least common multiple = " + lcm);
    }
}
