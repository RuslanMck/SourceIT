public class ArrayMerging {

    public static void main(String[] args) {
        int[] arrFst = {0, 1, 5, 7, 8};
        int[] arrSec = {2, 3, 4, 6, 9};
        int[] arrRes = new int[arrFst.length + arrSec.length];
        int varFst = 0;
        int varSec = 0;

        for (int i = 0; i < arrRes.length; i++) {
            if (varFst < arrFst.length && varSec < arrRes.length) {
                if (arrSec[varSec] < arrFst[varFst]) {
                    arrRes[i] = arrSec[varSec++];
                } else {
                    arrRes[i] = arrFst[varFst++];
                }
            } else if (varSec < arrSec.length) {
                arrRes[i] = arrSec[varSec++];
            } else {
                arrRes[i] = arrFst[varFst++];
            }
        }
        for (int i = 0; i < arrRes.length; i++) {
            System.out.print(arrRes[i] + " ");
        }
    }
}
