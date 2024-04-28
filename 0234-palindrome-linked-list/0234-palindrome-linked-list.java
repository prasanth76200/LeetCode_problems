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
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversed = reverse(slow.next);
        
        ListNode list1 = head;
        ListNode list2 = reversed;
        
        while(list2!=null){
            if(list1.val!=list2.val){
                return false;
            }
            list1=list1.next;
            list2=list2.next;
            
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxtCurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxtCurr;
        }
        return prev;
    }
}