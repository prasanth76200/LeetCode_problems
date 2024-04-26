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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur = head;
        for(int i = 0; i < k-1; i++){

            cur = cur.next;
        }

        ListNode left = cur;
        ListNode right = head;
        while(cur.next != null) {
            cur = cur.next;
            right = right.next;
        }
        
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}