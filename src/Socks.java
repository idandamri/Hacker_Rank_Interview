import java.util.HashMap;

public class Socks {

    // Complete the repeatedString function below.
    static int sockMerchant(int n, int[] ar) {
        int retVal = 0;
        HashMap<Integer, Integer> colors = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (!colors.containsKey(ar[i])) {
                colors.put(ar[i], 1);
            }
            else {
                colors.put(ar[i], colors.get(ar[i]) + 1);
            }
        }
        for (Integer val : colors.values()) {
            retVal += val/2;
        }
        return retVal;
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        long result = sockMerchant(9, arr);
        System.out.println(result);
        arr = new int[]{1,2,1,2,1,2,3};
        result = sockMerchant(7, arr);
        System.out.println(result);
    }
}
