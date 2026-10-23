class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = mergeTwoLists(result, lists[i]);
        }

        return result;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode dummy = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            } else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }

        if (list1 != null) {
            dummy.next = list1;
        } else {
            dummy.next = list2;
        }

        return result.next;
    }
}
