package leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P1394FindLuckiestInteger {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 2, 2, 3, 3, 3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        int luckyNumber = -1;
        System.out.println(map);


        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == luckyNumber) continue;
            if(entry.getKey().equals(entry.getValue())){
                luckyNumber = Math.max(luckyNumber, entry.getKey());
            }
        }

        return luckyNumber;
    }
}
