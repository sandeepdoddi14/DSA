package dsa;

import java.util.Collections;
import java.util.PriorityQueue;

//max and min heap
//heapify
//*** accepts duplicate elements
public class HeapPriorityQueue {

    public static void main(String[] args) {
        int[] nums  = {2,2,3,1};
        System.out.println(findKthLargest(nums, 3));
        //System.out.println(maxProduct(nums));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//minheap

        for (int num : nums) {
            if(!minHeap.contains(num)) //condition to remove duplicates
                minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.remove(minHeap.peek());
        }
       return minHeap.peek();
    }

    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());//maxHeal
        for (int num : nums) {
            maxHeap.add(num);
        }
        int v1= maxHeap.peek() ;
        maxHeap.remove(maxHeap.peek());
        int v2= maxHeap.peek();
        return v1*v2;
    }

    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length==2)
            return nums;
        int[] sum = new int[k] ;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();//maxHeal
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.remove(maxHeap.peek());
        }

        for(int i=0;i<k;i++)
        {
            sum[i] = maxHeap.peek();
            maxHeap.remove(maxHeap.peek());
        }

        return sum;
    }

    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//minheap

        for (int num : nums) {
            minHeap.add(num);
        }

        int[] result = new int[nums.length];
        int index = 0;
        while (minHeap.size() > 1) {
            result[index] = minHeap.poll();
            index = index +1;
        }
        return result;
    }

  /*  public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//minheap

        for (int num : nums) {
            minHeap.add(num);
        }

        return  0;
    }*/
}
