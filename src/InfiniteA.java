public class InfiniteA{

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long retVal = 0;
        if(!s.isEmpty()){
            long numberOfFullStingsInN = n/s.length();
            retVal = numberOfFullStingsInN*getNumberOfAInStr(s,s.length());
            n = n-numberOfFullStingsInN*s.length();
            retVal += getNumberOfAInStr(s,n);
        }
        return retVal;
    }

    private static long getNumberOfAInStr(String s, long strLength) {
        long retVal = 0;
        for (int i = 0; i < strLength; i++) {
            if(s.charAt(i) == 'a'){
                retVal++;
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
        String str = "aba";
        long result = repeatedString(str, 10);
        System.out.println(result);
        str = "a";
        result = repeatedString(str, 1000000000000l);
        System.out.println(result);
    }
}