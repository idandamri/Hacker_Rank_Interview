public class BiggestChar {
    // Complete the repeatedString function below.
    static char biggestChar(char[] string) {
        char retVal = '-';
        int bigDiff = 1000000;
        for (char c : string) {
            int temp = 'z' - c;
            if(bigDiff > temp){
                bigDiff = temp;
                retVal = c;
            }
        }
        return retVal;
    }


    public static void main(String[] args) {
        char result = '-';
        result = biggestChar(new char[] {'x','d','a','n'});
        System.out.println(result);
    }
}
