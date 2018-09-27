public class ArrayMerging {

    public static void main(String[] args) {
        int[] arrFst = {0, 1, 5, 7, 8};
        int[] arrSec = {2, 3, 4, 6, 9};
        int[] arrRes = new int[arrFst.length + arrSec.length];
        int varArrFst = 0;
        int varArrSec = 0;

        for (int i = 0; i < arrRes.length; i++) {
            if (varArrFst < arrFst.length && varArrSec < arrRes.length) {
                if (arrSec[varArrSec] < arrFst[varArrFst]) {
                    arrRes[i] = arrSec[varArrSec++];
                } else {
                    arrRes[i] = arrFst[varArrFst++];
                }
            } else if (varArrSec < arrSec.length) {
                arrRes[i] = arrSec[varArrSec++];
            } else {
                arrRes[i] = arrFst[varArrFst++];
            }
        }
        for (int i = 0; i < arrRes.length; i++) {
            System.out.print(arrRes[i] + " ");
        }
    }
}
