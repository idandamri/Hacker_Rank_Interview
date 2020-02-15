import java.util.HashMap;
import java.util.HashSet;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {
        String retVal = "NO";
        String toMap = "";
        String toSearch = "";
        if(s1.length() > s2.length()){
            toMap = s1;
            toSearch = s2;
        }
        else {
            toMap = s2;
            toSearch = s1;
        }

//        HashMap<Character, HashMap> map = new HashMap<>();
//        for (int i = 0; i < toMap.length(); i++) {
//            if(map.get(toMap.charAt(i)) == null){
//                map.put(toMap.charAt(i), new HashMap());
//            }
//            else {
//                map.get(toMap.charAt(i)).put(toMap.charAt(i), new HashMap());
//            }
//        }

        HashSet<Character> map = new HashSet<>();
        for (int i = 0; i < toMap.length(); i++) {
            map.add(toMap.charAt(i));
        }
        for (int i = 0; i < toSearch.length(); i++) {
            if(map.contains(toSearch.charAt(i))){
                retVal = "YES";
                break;
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
    }
}
