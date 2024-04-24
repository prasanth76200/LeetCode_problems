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
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next!=null && fast.next.next!=null){
            
               fast = fast.next.next;
                slow =slow.next;
            
        }
       
        ListNode doReverse = reverse(slow.next);
        
        ListNode p1 =head ;
        ListNode p2 = doReverse;
        
        while(p2!=null){
            
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        
        return true;
        
    }
    
    
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode nextCurr = curr.next;
            curr.next=prev;
            prev = curr;
            curr=nextCurr;
            
        }
          return prev;
        
        
}
        
    
}