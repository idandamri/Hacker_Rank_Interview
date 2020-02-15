public class Hourglass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int retVal = -999999999;
        int hourGlassSum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                hourGlassSum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                                             + arr[i][j] +
                               arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                retVal = Math.max(retVal, hourGlassSum);
            }
        }
        return retVal;
    }


    public static void main(String[] args) {
        int result = 0;
        int[][] arr = new int[][] {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}};
        result = hourglassSum(arr);
        System.out.println(result);
        arr = new int[][] {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}};
        result = hourglassSum(arr);
        System.out.println(result);
    }
}
