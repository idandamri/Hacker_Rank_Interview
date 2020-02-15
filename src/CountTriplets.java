import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
/** not full solution **/
//    // Complete the countTriplets function below.
//    static long countTriplets(List<Long> arr, long r) {
//        long retVal = 0;
//        if (arr.size() > 2) {
//            for (int i = 0; i < arr.size(); i++) {
//                for (int j = i+1; j < arr.size() ; j++) {
//                    if(arr.get(i) <= arr.get(j) && arr.get(j) == r*arr.get(i)) {
//                        for (int k = j + 1; k < arr.size() ; k++) {
//                            if(arr.get(j) <= arr.get(k) && arr.get(k) == r*arr.get(j)) {
//                                retVal += 1;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return retVal;
//    }

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> t2 = new HashMap<>();
        Map<Long, Long> t3 = new HashMap<>();
        long result = 0L;

        for(Long a : arr) {
            result += t3.getOrDefault(a, 0L);
            if (t2.containsKey(a)){
                t3.put(a*r, t3.getOrDefault(a*r, 0L) + t2.get(a));
            }
            t2.put(a*r, t2.getOrDefault(a*r, 0L) + 1);
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList();

        list.add((long) 1);
        list.add((long) 2);
        list.add((long) 2);
        list.add((long) 4);

        System.out.println(countTriplets(list,2));
        list.clear();

        list.add((long) 1);
        list.add((long) 5);
        list.add((long) 5);
        list.add((long) 25);
        list.add((long) 125);

        System.out.println(countTriplets(list,5));
        list.clear();

        list.add((long) 1);
        list.add((long) 3);
        list.add((long) 9);
        list.add((long) 9);
        list.add((long) 27);
        list.add((long) 81);

        System.out.println(countTriplets(list,3));
//        System.out.println(countTriplets(list,2));
//        System.out.println(countTriplets(list,2));
    }
}
