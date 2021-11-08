/*
Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
*/

package String;

public class _1941 {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char [] strArray = s.toCharArray();
        for( char c : strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }
            else{
                charCountMap.put(c,1);
            }
        }
        int count = charCountMap.get(strArray[0]);

        for(Map.Entry entry : charCountMap.entrySet()){
            if(!entry.getValue().equals(count))
                return false;
        }
        return true;
    }
}
