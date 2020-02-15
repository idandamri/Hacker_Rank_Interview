import java.util.HashMap;

public class MakeAnagram {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int retVal = 0;
        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        HashMap<Character, Integer> mapC = new HashMap<>();
        sortStringToMapA(a, mapA, mapC);

        sortStringToMapB(b, mapB, mapC);

        sortStringToMapC(mapA,mapB,mapC);
        if(a.length() > b.length()){
            retVal = updateNumOfCharsToDelete(retVal, mapA, mapB, mapC);
        }
        else {
            retVal = updateNumOfCharsToDelete(retVal, mapB, mapA, mapC);
        }

        return retVal;
    }

    private static void sortStringToMapC(HashMap<Character, Integer> a, HashMap<Character, Integer> b, HashMap<Character, Integer> mapC) {
        for (Character character : a.keySet()) {
            if(!mapC.containsKey(character)){
                mapC.put(character, 0);
            }
            mapC.put(character, a.get(character));
        }

        for (Character character : b.keySet()) {
            if(!mapC.containsKey(character)){
                mapC.put(character, 0);
            }
            mapC.put(character, mapC.get(character) + b.get(character));
        }
    }

    private static void sortStringToMapB(String b, HashMap<Character, Integer> mapB, HashMap<Character, Integer> mapC) {
        for (int i = 0; i < b.length(); i++) {
            if (!mapB.containsKey(b.charAt(i))) {
                mapB.put(b.charAt(i), 1);
            } else {
                mapB.put(b.charAt(i), mapB.get(b.charAt(i)) + 1);
            }
        }
    }

    private static void sortStringToMapA(String a, HashMap<Character, Integer> mapA, HashMap<Character, Integer> mapC) {
        for (int i = 0; i < a.length(); i++) {
            if (!mapA.containsKey(a.charAt(i))) {
                mapA.put(a.charAt(i), 1);
            } else {
                mapA.put(a.charAt(i), mapA.get(a.charAt(i)) + 1);
            }
        }
    }

    private static int updateNumOfCharsToDelete(int retVal, HashMap<Character, Integer> map1,
                                                HashMap<Character, Integer> map2, HashMap<Character, Integer> mapTotal) {
        for (Character character : map2.keySet()) {
            if(map1.containsKey(character)){
                Integer diff = 2*Math.min(map1.get(character),map2.get(character));
                mapTotal.put(character, mapTotal.get(character) - diff);
//                retVal += (Math.max(map1.get(character),map2.get(character))
//                        - Math.min(map1.get(character),map2.get(character)));
            }
        }

        for (Integer val : mapTotal.values()) {
            retVal += val;
        }
        return retVal;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("cdf", "dce"));
        System.out.println(makeAnagram("cde", "abc"));
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}
