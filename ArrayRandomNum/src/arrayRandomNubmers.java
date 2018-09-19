import java.util.Random;

public class arrayRandomNubmers {

    public static void main(String[] args) {
        Random random = new Random();

        int array[] = new int [10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10) +1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position №" + i + " in array = " + array[i]);
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.print("Even numbers is: " + array[i] + "; ");
            }
        }
    }
}
