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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode dummy = res;
        int carry = 0;

        while(l1!=null || l2!=null){
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 == null ? 0 : l2.val;

            int sum = d1 + d2 + carry;
            int val = sum % 10;
            carry = sum/10;

            dummy.next = new ListNode(val);

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            dummy = dummy.next;  
        }

        if(carry != 0){
            dummy.next = new ListNode(carry);
        }

        return res.next;


    }
}
