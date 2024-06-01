class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        
        // Calculate the length of the list
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        // Make the list circular
        tail.next = head;
        
        // Calculate the effective rotations needed
        k = k % len;
        if (k == 0) {
            tail.next = null; // Break the circle before returning
            return head;
        }
        
        // Find the new tail, which is (len - k - 1) steps from the original head
        for (int i = 0; i < len - k; i++) {
            tail = tail.next;
        }
        
        // New head is next of the new tail
        head = tail.next;
        
        // Break the circle
        tail.next = null;
        
        return head;
    }
}
