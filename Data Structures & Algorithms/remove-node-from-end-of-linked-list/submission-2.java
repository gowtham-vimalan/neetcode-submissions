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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null && n == 1){
            return null;
        }
        ListNode res = new ListNode(0);
        res.next = head;

        ListNode slowPointer = res;
        ListNode fastPointer = res;

        for(int i=0; i<=n; i++){
            fastPointer = fastPointer.next;
        }

        while(fastPointer != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        slowPointer.next = slowPointer.next.next;

        return res.next;

    }
}
