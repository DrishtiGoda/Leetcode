/*
A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
Note that the strings are considered in the order in which they appear in the array.

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned.

Input: arr = ["a","b","a"], k = 3
Output: ""
Explanation:
The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
*/


package String;

public class _2053 {
    public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String i : arr){
            Integer j = map.get(i);
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        for(String i : arr){
            if(map.get(i) == 1){
                k--;
                if (k==0)
                    return i;
            }
        }
        return "";
    }
}
