import java.util.Arrays;

public class ChoiceSorting {

    public static void main(String[] args) {
        int arr[] = {4, 7, 1, 9, 2, 5, 3, 6, 8};
        System.out.println(Arrays.toString(arr));
        arraySorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arraySorting (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            int idx = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            if (i != idx){
                int tmp = arr[i];
                arr[i] = arr [idx];
                arr[idx] = tmp;
            }
        } return arr;
    }
}
