public class arrayEvenNumber {

    public static void main(String[] args) {
        int array[] = new int [101];

        for (int i = 1; i <= 100; i++) {
            array[i] = i;

            if (i%2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
