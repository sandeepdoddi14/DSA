package dsa;

import java.util.LinkedList;

//its an interface
//classes are priority queue, linked list
public class Queue {
    public static void main(String[] args) {
        int[] tickets = {5, 1, 1, 1};
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets, k));


    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }

        while (queue.peek() != k ||  tickets[queue.peek()] !=1) {
            if (tickets[queue.peek()] == 0) {
                queue.poll();
            }
            else  if (tickets[queue.peek()] != 1) {
                time = time + 1;
                tickets[queue.peek()] = tickets[queue.peek()] - 1;
                int temp = queue.poll();
                queue.add(temp);
            } else {
                time = time + 1;
                tickets[queue.peek()] = tickets[queue.peek()] - 1;
                int temp = queue.poll();
                queue.add(temp);
            }

        }
        return time + tickets[queue.peek()];
    }
}
