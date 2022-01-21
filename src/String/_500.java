/*Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
*/

package String;
import java.util.ArrayList;

public class _500 {
    public String[] findWords(String[] words) {
        ArrayList<String> answer = new ArrayList<String>();

        for(int i=0; i<words.length; i++){
            String s = words[i].toLowerCase();
            if(s.matches("^[qwertyuiop]*$") || s.matches("^[asdfghjkl]*$") || s.matches("^[z*$xcvbnm]*$")){
                answer.add(words[i]);
            }
        }
        String[] ret = new String[answer.size()];
        ret = answer.toArray(ret);
        return answer.toArray(ret);
    }
}
