package RemoveNodeFromEndList;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int lenList = 0;
        ListNode tmp = head;

        while (tmp != null) {
            ++lenList;
            tmp = tmp.next;
        }
        tmp = head;
        if (lenList - n - 1 >= 0) {
            for (int i = 0; i != lenList - n - 1; ++i)
                head = head.next;
        }
        else
            return head.next;
        if (head.next != null) {
            if (head.next.next != null)
                head.next = head.next.next;
            else
                head.next = null;
        }
        return tmp;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3,new ListNode(4, new ListNode(5, null)))));
        int deleteElement = 2;
        System.out.println("Start list:");
        printList(list);
        System.out.println("List after removing element " + deleteElement + " from the end:");
        printList(removeNthFromEnd(list, deleteElement));
    }
    private static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }
}
