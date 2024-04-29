/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

       int k = getLength(headA);
       int z = getLength(headB);
        
        while(k > z){
            k--;
            headA=headA.next;
        }
        
        while(z>k){
            z--;
            headB=headB.next;
        }
        
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
      
        
    }
    private int getLength(ListNode head){
        int count=0;
        
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    
}