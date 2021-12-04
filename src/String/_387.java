/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Input: s = "leetcode"
Output: 0
 */

package String;

public class _387 {
    public int firstUniqChar(String s) {
        int[] counts = new int[26];

        for (int i = 0; i< s.length(); i++){
            counts[s.charAt(i) - 'a']++;
        }
        for(int i =0; i< s.length(); i++){
            if(counts[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
