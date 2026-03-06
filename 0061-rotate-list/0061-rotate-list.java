class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0)
            return head;

        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        tail.next = head; // make circular list

        int rotatePoint = length - (k % length);
        tail = head;

        while (rotatePoint > 1) {
            tail = tail.next;
            rotatePoint--;
        }

        head = tail.next;
        tail.next = null;

        return head;
    }
}