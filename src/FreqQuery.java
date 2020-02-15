import java.util.*;

public class FreqQuery {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(int[][] queries) {
        ArrayList<Integer> RetVal = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {
//            ArrayList<Integer> query = Arrays.asList(queries.get(i));
            int[] query = queries[i];
            if(query[0] == 1){
                if(!hashMap.containsKey(query[1])){
                    hashMap.put(query[1], 1);
                }
                else {
                    hashMap.put(query[1], hashMap.get(query[1]) + 1);
                }
            }
            else if(query[0] == 2){
                if(hashMap.containsKey(query[1])){
                    hashMap.remove(query[1]);
//                    if (hashMap.get(query[1]) == 1) {
//                        hashMap.put(query[1], 0);
//                    } else {
//                        hashMap.put(query[1], hashMap.get(query[1]) - 1);
//                    }
                }
            }
            else if(query[0] == 3){
                int counter = 0;
                for (Integer val : hashMap.values()) {
                    if(val == query[1]){
                        counter++;
                    }
                }
                RetVal.add(counter > 0 ? 1 : 0);
            }
        }
        return RetVal;
    }

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

//        List<Integer> supList = new ArrayList<>();
//        supList.add(1);
//        supList.add(5);
        list.add(new int[]{1,5});
//        supList = new ArrayList<>();
//        supList.add(1);
//        supList.add(6);
        list.add(new int[]{1,6});
//        supList = new ArrayList<>();
//        supList.add(3);
//        supList.add(2);
        list.add(new int[]{3,2});
//        supList = new ArrayList<>();
//        supList.add(1);
//        supList.add(10);
        list.add(new int[]{1,10});
//        supList = new ArrayList<>();
//        supList.add(1);
//        supList.add(10);
        list.add(new int[]{1,10});
//        supList = new ArrayList<>();
//        supList.add(1);
//        supList.add(6);
        list.add(new int[]{1,6});
//        supList = new ArrayList<>();
//        supList.add(2);
//        supList.add(5);
        list.add(new int[]{2,5});
//        supList = new ArrayList<>();
//        supList.add(3);
//        supList.add(2);
        list.add(new int[]{3,2});
//        freqQuery(list).toString();

    }
}
