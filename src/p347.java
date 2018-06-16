//import java.util.*;
//
//public class p347 {
//    /*
//
//    Given a non-empty array of integers, return the k most frequent elements.
//
//For example,
//Given [1,1,1,2,2,3] and k = 2, return [1,2].
//
//Note:
//You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
//Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
//
//     */
//
//    public static void main(String[] args) {
//
//    }
//
//    public List<Integer> topKFrequent(int[] nums, int k) {
//
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i ++) {
//            if(map.containsKey(nums[i])) {
//                map.replace(nums[i],map.get(nums[i]) + 1);
//            }   else {
//                map.put(nums[i], 1);
//            }
//        }
//
//        Collections.sort();
//
//    }
//}
