import java.time.LocalTime;
import java.util.Scanner;

public class HelloLocalTime {
    public static void main(String[] args) {

        System.out.println("Hello! What is your name?");
        System.out.print("My name is: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        LocalTime time = LocalTime.now();
        int hours = time.getHour();

        if (hours >= 6 && hours <= 12) {
            System.out.println("Good morning, " + name + " and have a nice day!");
        }
        if (hours >= 12 && hours <= 18) {
            System.out.println("Good day, " + name + "!");
        }
        if (hours >= 18 && hours <= 22) {
            System.out.println("Good evening, " + name + " and good night!");
        } else {
            System.out.println("Zzzzzzzz");
        }
    }
}