/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Input: head = [1,1,2]
Output: [1,2]

Input: head = [1,1,2,3,3]
Output: [1,2,3]
* */


package LinkedList;

public class _83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            prev = curr;
            curr = curr.next;
            while(curr != null && prev.val == curr.val){
                ListNode temp = curr;
                curr = curr.next;
                temp.next = null;
            }
            prev.next = curr;
        }
        return head;
    }
}
