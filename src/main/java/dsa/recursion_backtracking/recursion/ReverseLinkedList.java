package dsa.recursion_backtracking.recursion;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }



    //using iterative
    //t - o(n)
    //s - o(1)
    public ListNode reverseListWithoutStack(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next; // Save next node
            currentNode.next = previousNode;      // Reverse the link
            previousNode = currentNode;           // Move previousNode forward
            currentNode = nextNode;               // Move currentNode forward
        }

        return previousNode;
    }


    //time complexity-o(2n)
    //space comple-o(n)
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        Stack<Integer> stack = new Stack<Integer>();
        while (head.next != null) {
            stack.push(head.val);
            head = head.next;
        }
        stack.push(head.val);
        head = head.next;

        ListNode newHead = new ListNode(stack.pop());
        ;
        while (!stack.isEmpty()) {
            newHead.next = new ListNode(stack.pop());
            newHead = newHead.next;
        }

        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
