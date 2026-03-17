package leetcode.problems.easy;

import leetcode.prepare.ListNode;
import leetcode.prepare.RandomCollections;

import java.util.List;

public class RemoveDuplicateFromList83 {
    public static void main(String[] args) {
        List<Integer> list = RandomCollections.getSortedList(10, 1, 10);
        ListNode listNode = ListNode.createListNode(list);
        ListNode.printListNode(listNode);
        ListNode answer = deleteDuplicates(listNode);
        System.out.println("=================================================");
        ListNode.printListNode(answer);
    }

    public static ListNode deleteDuplicates(ListNode head) {


        if (head == null) {
            return null;
        }
        ListNode current;
        current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }


        }
        return head;
    }

}
