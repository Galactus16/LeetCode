/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;
        int carry = 0;
        
        ListNode prevNode = new ListNode(0);
        ListNode head = prevNode;
        
        while(l1 != null || l2 != null || carry != 0){
           
           ListNode currNode = new ListNode(0);
           
           sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
           carry = sum / 10;
           currNode.val = sum % 10;
           
           prevNode.next = currNode;
           prevNode = currNode;
           
           l1 = (l1 != null) ? l1.next : l1;
           l2 = (l2 != null) ? l2.next : l2;
        }
        
      return head.next;
        
    }
}