
public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int retVal = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.length() > 1) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    retVal++;
                }
            }
        }
        return retVal;
    }

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters2(String s) {
        int j = 1;
        int retVal = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.length() > 1) {
                if (s.charAt(i) == s.charAt(j)) {
                    retVal++;
                    s = s.substring(0, i) + s.substring(j);
                    i--;
                    j--;
                }
                j++;
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
