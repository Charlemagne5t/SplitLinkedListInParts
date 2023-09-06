import org.junit.Test;

public class SolutionTest {
    @Test
    public void splitListToPartsTest(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        int k = 3;
        ListNode[] listNodes = new Solution().splitListToParts(head, k);
        for (ListNode l: listNodes) {
            System.out.println();
            print(l);
            System.out.println("-------------");
        }

    }
    public static void print(ListNode head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
    }
}
