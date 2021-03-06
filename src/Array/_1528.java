/*You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*/

package Array;

public class _1528 {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];

        for ( int i=0; i<indices.length; i++){
            ans[indices[i]]=s.charAt(i);
        }
        return  new String(ans);
    }
}
