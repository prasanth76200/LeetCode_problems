/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        Map<ListNode,Integer> visited = new HashMap<>();
        
        ListNode curr = head;
        int index =0;
        
        while(curr!=null){
            if(visited.containsKey(curr)){
                return curr;
                
                
            }
            
            visited.put(curr,index);
            curr = curr.next;
            index++;
            
        }
        return null;
        
    }
}