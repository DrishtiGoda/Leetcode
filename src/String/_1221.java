/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it in the maximum amount of balanced strings.
Return the maximum amount of split balanced strings.

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
*/


package String;

public class _1221 {
    public int balancedStringSplit(String s) {
        int incrementL = 0;
        int answer = 0;
        for(char c : s.toCharArray()){
            if(c == 'L'){
                incrementL = incrementL + 1;
            }else{
                incrementL = incrementL - 1;
            }
            if(incrementL == 0 ){
                answer = answer + 1;
            }
        }
        return answer;
    }
}
