/*
* You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false

* Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
* */

package String;

public class _1704 {
    public boolean halvesAreAlike(String s) {

        String vowels = "aeiouAEIOU";
        int mid = s.length()/2;
        int ans = 0;

        for (int i = 0, j = mid; i < mid; i++, j++) {
            if(vowels.indexOf(s.charAt(i)) >= 0){
                ans++;
            }
            if(vowels.indexOf(s.charAt(j)) >= 0 ){
                ans--;
            }
        }
        return ans == 0;
    }
}
