public class ChoiceSorting {

    public static void main(String[] args) {

        int arrOfNumb[] = {4, 7, 1, 9, 2, 5, 3, 6, 8};
        System.out.println(PrintArray(arrOfNumb));
        arraySorting(arrOfNumb);
        System.out.println(PrintArray(arrOfNumb));
    }

    public static int[] arraySorting (int[] arrOfNumb) {
        for (int i = 0; i < arrOfNumb.length; i++){
            int min = arrOfNumb[i];
            int idx = i;

            for (int j = i + 1; j < arrOfNumb.length; j++){
                if (arrOfNumb[j] < min){
                    min = arrOfNumb[j];
                    idx = j;
                }
            }
            if (i != idx){
                int tmp = arrOfNumb[i];
                arrOfNumb[i] = arrOfNumb [idx];
                arrOfNumb[idx] = tmp;
            }
        }
        return arrOfNumb;
    }

    public static String PrintArray(int[] someArray) {

        String print = "";

        for (int i = 0; i < someArray.length; i++){
            print += someArray[i] + " ";
        }
        return print;
    }

}
