class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Move fast pointer n steps ahead
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        
        // If fast becomes null, remove head
        if(fast == null){
            return head.next;
        }
        
        // Move both pointers
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        // Remove nth node
        slow.next = slow.next.next;
        
        return head;
    }
}