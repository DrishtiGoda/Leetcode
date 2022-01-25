/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*/

package String;

public class _1768 {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int length = Math.max(word1.length(), word2.length());

        for(int i=0; i<= length-1; i++){
            if(i< word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i< word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

}
