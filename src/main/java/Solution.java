import java.util.Arrays;

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int c = 0;
        ListNode temp = head;

        while(temp != null) {
            c++;
            temp = temp.next;
        }
        int base = c / k;
        int add = c % k;
        int[] count = new int[k];
        Arrays.fill(count, base);

        for(int i = 0; i < add; i++) {
            count[i]++;
        }
        temp = head;
        ListNode[] res = new ListNode[k];
        for(int i = 0; i < k; i++) {
            head = temp;
            res[i] = head;
            count[i]--;
            if(head == null) {
                break;
            }
            while(count[i] > 0) {
                count[i]--;
                head = head.next;
            }
            temp = head.next;
            head.next = null;

        }

        return res;

    }
}