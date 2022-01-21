/*Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates).
 You may return the answer in any order.

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
*/

package String;
import java.util.ArrayList;
import java.util.List;

public class _1002 {
    public List<String> commonChars(String[] words) {

        ArrayList<String> answer = new ArrayList<>();

        for (int i=0; i<words[0].length(); i++) {
            int flag = 0;
            char c = words[0].charAt(i);
            for(int j=1; j<words.length; j++){
                int index = words[j].indexOf(c);
                if(index == -1){
                    flag = 1;
                    break;
                }
                else{
                    words[j]= words[j].substring(0, index) + words[j].substring(index+1);
                }
            }
            if (flag==0) {
                answer.add(Character.toString(c));
            }
        }
        return answer;
    }
}
