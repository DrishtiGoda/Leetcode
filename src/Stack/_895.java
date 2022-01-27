/*Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.

Implement the FreqStack class:

FreqStack() constructs an empty frequency stack.
void push(int val) pushes an integer val onto the top of the stack.
int pop() removes and returns the most frequent element in the stack.
If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.

Input
["FreqStack", "push", "push", "push", "push", "push", "push", "pop", "pop", "pop", "pop"]
[[], [5], [7], [5], [7], [4], [5], [], [], [], []]
Output
[null, null, null, null, null, null, null, 5, 7, 5, 4]

*/


package Stack;

import java.util.HashMap;
import java.util.Map;

public class _895 {

    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        int f = freq.getOrDefault(val, 0)+1;
        freq.put(val,f);

        if(f > maxFreq){
            maxFreq = f;
        }
        group.computeIfAbsent(f, z-> new Stack()).push(val);

    }

    public int pop() {
        int x = group.get(maxFreq).pop();
        freq.put(x, freq.get(x) -1);
        if(group.get(maxFreq).size() == 0)
            maxFreq--;
        return x;
    }
}
