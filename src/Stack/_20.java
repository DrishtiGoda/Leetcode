/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Input: s = "()"
Output: true

Input: s = "(]"
Output: false
*/


package Stack;

public class _20 {
    public boolean isValid(String s) {

        Stack stack = new Stack();

        for(int i=0; i<s.length(); i++){
            if(i==0){
                stack.push(s.charAt(i));
            }else{
                if(stack.size()!=0 &&s.charAt(i)==')'&&(char) stack.peek()=='('){
                    stack.pop();
                }else if(stack.size()!=0 &&s.charAt(i)==']'&& (char)stack.peek()=='['){
                    stack.pop();
                }else if(stack.size()!=0 && s.charAt(i)=='}'&& (char)stack.peek()=='{'){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.size()==0)
        {
            return true;
        }
        return false;
    }
}
