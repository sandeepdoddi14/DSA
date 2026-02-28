package dsa.LinkedList;

public class LinkedList {

    /**
     * In Java, ListNode objects are references. When you do:
     *
     * ListNode current = head;
     *
     *
     * you’re not creating a copy of the node — you’re pointing to the same node in memory.
     * So when you modify current.next, you’re literally changing the next pointer inside the node that head also points to.
     *
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current !=null && current.next!=null)
        {
            if(current.val == current.next.val)
                current.next = current.next.next;

            else
                current = current.next;
        }
        return  current;
    }
}
