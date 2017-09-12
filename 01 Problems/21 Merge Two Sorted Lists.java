/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //If any of the list is empty return the other one
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        
        //Using recursion
        if(l1.val < l2.val){ //if 1st one is less than 2nd one
            l1.next = mergeTwoLists(l1.next,l2); // l1.next will be whatever is returned by next call
            return l1; //for this call return l1
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }     
    }
}