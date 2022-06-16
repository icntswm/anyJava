package RemoveDuplicatesfromSortedList2;

import java.util.*;

public class Main {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> saveDuplicateNumbers = new HashSet<>();

        while (tmp != null) {
            if (saveDuplicateNumbers.contains(tmp.val))
                hs.remove(tmp.val);
            else {
                hs.add(tmp.val);
                saveDuplicateNumbers.add(tmp.val);
            }
            tmp = tmp.next;
        }
        Object[] resArr = hs.toArray();
        if (resArr.length == 0)
            return null;
        Arrays.sort(resArr);
        tmp = head;

        for (int i = 0; i < resArr.length; ++i) {
            head.val = (Integer)resArr[i];
            if (i != resArr.length - 1)
                head = head.next;
        }
        if (head != null)
            head.next = null;
        return tmp;
    }
    public static void main(String[] args) {
        ListNode ln = deleteDuplicates(
                new ListNode(1,
                        new ListNode(2, new ListNode(3,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(4,
                                                        new ListNode(5, null)))))))
        );
        printList(ln);
    }
    private static void printList(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
        System.out.println();
    }
}
