/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null || l1.val == 0)
            return l2;
        
        if(l2 == null || l2.val == 0)
            return l1;
        
        if(l1.val == 0 && l2.val == 0)
            return new ListNode(0);
        
        ListNode n;
        StringBuilder sb = new StringBuilder();
        
        n = l1;
        while(n != null){
            sb.append(n.val);
            n = n.next;
        }
        
        long a = Long.parseLong(sb.toString());
        
        sb.setLength(0);
        
        n = l2;
        while(n != null){
            sb.append(n.val);
            n = n.next;
        }
        
        long b = Long.parseLong(sb.toString());
        
        long c = a + b;
        
        String cString = String.valueOf(c);
        
        //System.out.println(a+ " + "+ b+" = "+ c);
        long divisor;
        long mostValuedBit;
        ListNode head = new ListNode(0);
        ListNode currNode = null;
        ListNode prevNode = head;
        head.next = currNode;
        
        for(int i = cString.length() - 1; i >= 0; i--){
            divisor = (int)Math.pow(10,i);
            mostValuedBit = c / divisor;
            
            currNode = new ListNode((int)mostValuedBit);
            prevNode.next = currNode;
            prevNode = currNode;
            prevNode.next = null;
            
            c = c % divisor;
        }
        
        return head.next;
    }
}