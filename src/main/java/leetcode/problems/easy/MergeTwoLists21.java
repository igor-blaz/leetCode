package leetcode.problems.easy;

import leetcode.prepare.ListNode;
import leetcode.prepare.RandomCollections;

import java.util.List;

public class MergeTwoLists21 {
    public static void main(String[] args) {
        List<Integer> list1 = RandomCollections.getSortedList(2, 1, 10);
        List<Integer> list2 = RandomCollections.getSortedList(9, 1, 10);

        System.out.println("Сгенерирован 1 список " + list1.toString());
        System.out.println("Сгенерирован 2 список " + list2.toString());

        ListNode listNode1 = ListNode.createListNode(list1);
        ListNode listNode2 = ListNode.createListNode(list2);

        ListNode listNodeFinal = mergeTwoLists(listNode1, listNode2);
        System.out.println("=============================");
        ListNode.printListNode(listNodeFinal);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode.printListNode(list1);
        System.out.println("----------------------------------");
        ListNode.printListNode(list2);
        System.out.println("----------------------------------");


        ListNode current = new ListNode();
        ListNode head = null;


        if (list1 == null && list2 == null) {
            return null;
        }

        int min;
        while (list1 != null || list2 != null) {
            //Находим min
            if (list1 == null) {
                min = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                min = list1.val;
                list1 = list1.next;
            } else {
                if (list1.val < list2.val) {
                    min = list1.val;
                    list1 = list1.next;
                } else {
                    min = list2.val;
                    list2 = list2.next;
                }
            }
            //Ставим head или продолжаем от него, если он уже есть
            if (head == null) {
                head = new ListNode(min);
                current = head;

            } else {
                current.next = new ListNode(min);
                current = current.next;
            }


        }


        return head;
    }


}


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
//class Solution {
//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//
//
//        ListNode current = new ListNode();
//        ListNode head = null;
//
//
//        if (list1 == null && list2 == null) {
//            return null;
//        }
//
//        int min;
//        while (list1 != null || list2 != null) {
//            if (list1 == null) {
//                min = list2.val;
//                list2 = list2.next;
//            } else if (list2 == null) {
//                min = list1.val;
//                list1 = list1.next;
//            } else {
//                if (list1.val < list2.val) {
//                    min = list1.val;
//                    list1 = list1.next;
//                } else {
//                    min = list2.val;
//                    list2 = list2.next;
//                }
//            }
//            if (head == null) {
//                head = new ListNode(min);
//                current = head;
//
//            } else {
//                current.next = new ListNode(min);
//                current = current.next;
//            }
//
//
//        }
//
//
//        return head;
//    }
//}
