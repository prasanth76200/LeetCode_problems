/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        final ListNode node = new ListNode(0,head);
        ListNode prev = node;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode nxtCurr = curr.next;
            
            if(curr.val==val){
                prev.next = nxtCurr;
            }else{
                prev = curr;
                
            }
            curr = curr.next;
            
        }
        
             return node.next;
        }
   
    
}