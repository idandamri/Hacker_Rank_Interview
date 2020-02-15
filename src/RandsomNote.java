import java.util.HashMap;

public class RandsomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        if (magazine.length < note.length) {
            System.out.println("No");
            return;
        } else {
            HashMap<String, Integer> magazineMap = new HashMap();
            for (int i = 0; i < magazine.length; i++) {
                if (magazineMap.keySet().contains(magazine[i])) {
                    magazineMap.put(magazine[i], ((Integer) magazineMap.get(magazine[i]) + 1));
                }
                else {
                    magazineMap.put(magazine[i], 1);
                }
            }

            for (String word : note) {
                if(!magazineMap.keySet().contains(word)){
                    System.out.println("No");
                    return;
                }
                else {
                    if (magazineMap.get(word) == null){
                        System.out.println("No");
                        return;
                    }
                    else if (magazineMap.get(word) == 0){
                        System.out.println("No");
                        return;
                    }
                    else {
                        magazineMap.put(word, magazineMap.get(word)-1);
                    }
                }
            }
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
    }
}
