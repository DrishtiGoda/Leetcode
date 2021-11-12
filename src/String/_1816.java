/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
 */

package String;

public class _1816 {
    public String truncateSentence(String s, int k) {
        String [] words = s.split(" ");
        String sb = words[0];

        for(int i = 1; i< k; i++){
            sb = sb + " " + words[i];
        }
        return sb;
    }
}
