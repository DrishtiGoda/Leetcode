/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
*/


package HashTable;

public class _1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int val : map.values()){
            set.add(val);
        }

        if(set.size() == map.size())
        {
            return true;
        }else{
            return false;
        }
    }
}
