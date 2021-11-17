/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:

ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
*/


package String;

public class _1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int rule = 0;
        int result = 0;

        if(ruleKey.equals("color")){
            rule = 1;
        }else if(ruleKey.equals("name")){
            rule = 2;
        }

        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(rule).equals(ruleValue)){
                result = result + 1;
            }
        }
        return result;
    }
}
