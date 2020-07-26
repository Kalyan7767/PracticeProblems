package ninja.software.problems.algorithms;

import ninja.software.problems.model.ListNode;

public class LinkedList {

    ListNode head;
    ListNode top;

    public LinkedList() {
    }

    public void add(ListNode node) {
        if(head == null) {
            head = node;
        } else {
            top.next = node;
        }
        top = node;
    }

    public ListNode getNthNodeFromEnd(int n) {
        ListNode curr = head;
        for (int i = 0; i < n; i++) {
            if(curr == null) {
                return null;
            }
            curr = curr.next;
        }

        ListNode result = head;
        while (curr != null) {
            curr = curr.next;
            result = result.next;
        }
        return result;
    }
}
