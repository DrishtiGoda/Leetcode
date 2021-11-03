/*
Given the head of a singly linked list, return true if it is a palindrome.
Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false
*/


package LinkedList;

public class _234 {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> reverse = new Stack<ListNode>();
        ListNode temp = head;

        while(temp!= null){
            reverse.push(temp);
            temp = temp.next;
        }

        while(head!= null && !reverse.isEmpty()){
            if(reverse.pop().val != head.val) return false;
            else head = head.next;
        }
        return true;
    }
}
