public class ArrManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int a = 0;
        int b = 0;
        int k = 0;
        long retVal = 0;
        int[] arr = new int[n+2];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0];
            b = queries[i][1];
            k = queries[i][2];
            arr[a] +=k;
            arr[b+1] -=k;
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            retVal = Math.max(retVal, sum);
        }
        return retVal;
    }
// Complete the arrayManipulation function below.
    static long arrayManipulation2(int n, int[][] queries) {
        int a = 0;
        int b = 0;
        int k = 0;
        long retVal = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0];
            b = queries[i][1];
            k = queries[i][2];
            for (int j = a-1; j < b ; j++) {
                arr[j] = arr[j] + k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            retVal = Math.max(retVal, arr[i]);
        }
        return retVal;
    }

    public static void main(String[] args) {
        long retVal = 0;
        int[][] arr = new int[][] {
                {1,2,100},
                {2,5,100},
                {3,4,100}};
        retVal = arrayManipulation(5, arr);
        System.out.println(retVal);
        arr = new int[][] {
                {1,5,3},
                {4,8,7},
                {6,9,1}};
        retVal = arrayManipulation(10, arr);
        System.out.println(retVal);
        arr = new int[][] {
                {2,3,603},
                {1,1,286},
                {4,4,882}};
        retVal = arrayManipulation(4, arr);
        System.out.println(retVal);
    }
}
