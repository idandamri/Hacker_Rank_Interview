import java.util.Vector;

public class MinSwaps {


    // Complete the minimumSwaps function below.
    public static int minimumSwaps(int[] arr) {
        int retVal = 0;
        int i =0;
        while (arr.length > i){
            if(arr[i] != i+1){
                swap(arr, arr[i], i);
                retVal++;
            }
            else {
                i++;
            }
        }
        return retVal;
    }

    //b lower then a
    public static void swap(int[] q, int a, int b) {
        int temp = q[b];
        q[b] = q[a-1];
        q[a-1] = temp;
    }

    public static void main(String[] args) {
        int retVal = 0;
        int[] arr = new int[] {7,1,3,2,4,5,6};
        retVal = minimumSwaps(arr);
        System.out.println(retVal);
        arr = new int[] {4,3,1,2};
        retVal = minimumSwaps(arr);
        System.out.println(retVal);
    }
}
