/*
Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
Return the minimum number of steps to make t an anagram of s.
An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
 */



package String;

public class _1347 {
    public int minSteps(String s, String t) {
        int result = 0;
        int [] count = new int [26];
        for (int i = 0; i< s.length(); i++){

            count[s.charAt(i)-'a']++;
        }
        for (int j = 0; j< t.length(); j++){
            if (count[t.charAt(j) - 'a']-- <= 0){
                result++;
            }
        }
        return result;
    }
}
