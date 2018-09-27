public class ArrayMergingV2 {

    public static void main(String[] args) {
        int arrFsr[] = {0, 2, 3, 6, 9};
        int arrSec[] = {1, 4, 5, 7, 8};
        int arrRes[] = new int [arrFsr.length + arrSec.length];
        int varFst = 0;
        int varSec = 0;

        for (int i = 0; i < arrRes.length; i++){
            if (varFst < arrFsr.length && varSec < arrSec.length) {
                if (arrRes[varSec] < arrFsr[varFst]){
                    arrRes[i] = arrSec[varSec++];
                } else {
                    arrRes[i] = arrFsr[varFst++];
                }
            } else if (varSec < arrSec.length){
                arrRes[i] = arrSec[varSec++];
            } else {
                arrRes[i] = arrFsr[varFst++];
            }
        }
        for (int i = 0; i < arrRes.length; i++){
            System.out.print(arrRes[i] + " ");
        }
    }
}

