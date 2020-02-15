import java.util.Arrays;

public class MinBribes {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int retVal = 0;

        if(q.length > 1){
            for (int i = q.length-1; i > 1 ; i--) {
                if(q[i] != i+1){
                    if (q[i-1] == i+1){
                        swap(q, i, i-1);
                        retVal++;
                    }
                    else if(q[i-2] == i+1){
                        swap(q, i-1, i-2);
                        retVal++;
                        swap(q, i, i-1);
                        retVal++;
                    }
                    else{
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
            if (q[1] != 2){
                swap(q, 1, 0);
                retVal++;
            }
        }
        System.out.println(retVal);
    }

    //b lower then a
    public static void swap(int[] q, int a, int b) {
        int temp = q[b];
        q[b] = q[a];
        q[a] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,1,5,3,4};
        minimumBribes(arr);
        arr = new int[] {2,5,1,3,4};
        minimumBribes(arr);
    }
}
