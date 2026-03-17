package leetcode.prepare;


import lombok.Getter;

import java.util.List;

//for 21  th problem
@Getter
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createListNode(List<Integer> list) {
        if (list == null || list.isEmpty()) return null;

        ListNode head = new ListNode(list.getFirst());
        ListNode current = head;

        for (int i = 1; i < list.size(); i++) {

            current.next = new ListNode(list.get(i));
            current = current.next;
        }

        return head;
    }

    public static void printListNode(ListNode current) {
        System.out.println("Сгенерирован ListNode");
        while (current != null) {
            System.out.println(current.getVal());
            current = current.getNext();
        }
        System.out.println("------------------------------------------");
    }
}

