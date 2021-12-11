/*You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 */


package HashTable;
import java.util.HashSet;
import java.util.Set;

public class _1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int answer = 0;
        Set<Character> a = new HashSet<>();
        Set<Character> w = new HashSet<>();

        for(int i=0; i<allowed.length(); i++){
            a.add(allowed.charAt(i));
        }

        for(int i=0; i< words.length; i++){
            for(int j= 0; j< words[i].length(); j++){
                w.add(words[i].charAt(j));
            }
            if(a.containsAll(w)){
                answer ++;
            }
            w.clear();
        }
        return answer;
    }
}
