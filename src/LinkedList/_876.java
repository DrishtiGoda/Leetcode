/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
* */


package LinkedList;

public class _876 {
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int count = 0;

        while (current != null){
            current = current.next;
            count = count + 1;
        }
        count = count / 2;

        ListNode newCurrent = head;
        for (int i =0; i < count; i++)
        {
            newCurrent = newCurrent.next;
        }
        return newCurrent;
    }
}
