import java.io.*;

public class Clouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int retVal = 0;
        for (int i = c.length-1; i > 0; i--) {
            if (i > 1) {
                if (c[i - 2] == 0) {
                    i--;
                }
            }
            retVal++;
        }
        return retVal;
    }

    public static void main(String[] args) throws IOException {

        int[] arr = {0, 1, 0, 0, 0, 1, 0};
        int result = jumpingOnClouds(arr);
        System.out.println(result);
        arr = new int[]{0, 0, 0, 1, 0, 0};
        result = jumpingOnClouds(arr);
        System.out.println(result);
    }
}