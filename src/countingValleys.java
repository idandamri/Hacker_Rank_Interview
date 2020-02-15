import java.io.*;
import java.util.*;

public class countingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int retVal = 0;
        if(n<2 || n>(Math.pow(10,6))){
            return 0;
        }
        int height = 0;
        int heightHelper = 0;
        for(int i=0; i<s.length(); i++){
            heightHelper = height;
            if(s.charAt(i) == 68 || s.charAt(i) == 85){
                if(s.charAt(i) == 68){
                    height--;
                }
                if(s.charAt(i) == 85){
                    height++;
                }
                if(heightHelper == 0 && height < 0){
                    retVal++;
                }
            }
        }
        return retVal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int result = countingValleys(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD");
        result = countingValleys(12, "DDUUDDUDUUUD");
        int finalRes = result;
    }
}
