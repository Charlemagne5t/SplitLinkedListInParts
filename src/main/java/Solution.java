import java.util.Arrays;

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        ListNode dummy = head;
        int count = 0;
        while (dummy != null) {
            count++;
            dummy = dummy.next;
        }
        int base = count / k;
        int addOneToNNodes = 0;
        if (count % k != 0) {
            addOneToNNodes = count % k;
        }
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if(temp == null) break;
            if (addOneToNNodes != 0) {
                ListNode subHead = temp;
                head = temp;
                ListNode prev = null;
                for (int j = 0; j < base + 1; j++) {
                    prev = head;
                    head = head.next;
                }
                temp = head;
                prev.next = null;

                result[i] = subHead;
                addOneToNNodes--;
            } else {
                ListNode subHead = temp;
                head = temp;
                ListNode prev = null;
                for (int j = 0; j < base; j++) {
                    prev = head;
                    head = head.next;
                }
                temp = head;
                prev.next = null;

                result[i] = subHead;
            }

        }
        return result;
    }
}
