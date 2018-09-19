import java.util.Scanner;

public class CityDistance {

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.print("Please, enter the index of the city: ");
            int IdxFst = readValidStationIdx();

            System.out.print("Please, enter the index of the city: ");
            int IdxSec = readValidStationIdx();

            int res = distance(IdxFst, IdxSec);

            System.out.print("Distance from city " + IdxFst + " to city " + IdxSec);
            System.out.println(" is " + res + " kilometers. Have a good trip.");
        }

        public static int distance(int IdxFst, int IdxSec) {
            int[] distance = {0, 22, 6, 7, 17, 28, 4, 5, 11, 19, 83};

            int result = 0;

            if (IdxFst > IdxSec) {
                IdxFst = IdxFst + IdxSec;
                IdxSec = IdxFst - IdxSec;
                IdxFst = IdxFst - IdxSec;
            }
            for (; IdxFst < IdxSec; IdxFst++) {
                result += distance[IdxFst];
            }
            return result;
        }

        public static int readValidStationIdx() {
            while (true) {
                try {
                    int firstIndex = sc.nextInt();

                    if (firstIndex == 0 || firstIndex < 0 || firstIndex > 10) {
                        System.out.print("Incorrect index! Please, enter the correct index of the city: ");
                        sc.next();
                    }
                    return firstIndex;
                } catch (Exception e) {
                    System.out.print("Incorrect index! Please, enter the correct index of the city: ");
                    sc.next();
                }
            }
        }
}
