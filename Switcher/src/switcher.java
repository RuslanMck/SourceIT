public class switcher {

    public static void main(String[] args) {

        int a = 5;
        int b = 9;

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;

//        int temp = a;
//        a = b;
//        b = temp;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = 9 " + (a == 9));
        System.out.println("b = 5 " + (b == 5));
    }
}
