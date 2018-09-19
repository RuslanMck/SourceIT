import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String args[]) {

        fibo();
    }

    public static void fibo() {

        System.out.print("Enter the number from fibonacci sequence: ");

        Scanner inp = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c = 0;
        int num = inp.nextInt();

        for (int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Number " + num + " is equal to " + c + " in fibonacci sequence.");
    }
}
