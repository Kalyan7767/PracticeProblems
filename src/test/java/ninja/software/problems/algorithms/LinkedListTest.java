package ninja.software.problems.algorithms;

import ninja.software.problems.model.ListNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class LinkedListTest {
    LinkedList list = new LinkedList();

    @Test
    public void getNthNodeFromEnd() {
        ListNode result = new ListNode(30);
        list.add(new ListNode(10));
        list.add(new ListNode(20));
        list.add(result);
        list.add(new ListNode(40));
        list.add(new ListNode(50));
        list.add(new ListNode(60));
        list.add(new ListNode(70));
        Assert.assertThat(list.getNthNodeFromEnd(5), CoreMatchers.is(result));
        Assert.assertTrue(Objects.isNull(list.getNthNodeFromEnd(8)));
    }
}