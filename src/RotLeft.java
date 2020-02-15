import java.util.Arrays;

public class RotLeft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] retVal = a;
        if(d > 0 && d < a.length){
            for (int i = 0; i < d; i++) {
                int temp = a[0];
                swap(a);
                a[a.length-1] = temp;
            }
        }
        return retVal;
    }

    public static void swap(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] result;
        int[] arr = new int[] {1,2,3,4,5};
        result = rotLeft(arr, 4);
        System.out.println(Arrays.toString(result));
        arr = new int[] {1,2,3,4,5};
        result = rotLeft(arr, 4);
        System.out.println(Arrays.toString(result));
    }
}
