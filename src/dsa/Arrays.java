package dsa;

import java.util.PriorityQueue;

public class Arrays {

    public static void main(String[] args) {
        int[] nums = {2, 2};
        System.out.println(findErrorNums(nums));

    }

    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result[0] = nums[i];
                if (nums[i] > i + 1)
                    result[1] = nums[i] - 1;
                else
                    result[1] = nums[i] + 1;
            }
        }
        return result;
    }

    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//minheap
        if (nums.length == 2) {
            if (nums[0] > nums[1])
                return nums[0];
            else return nums[1];
        }
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > 3)
                minHeap.remove(minHeap.peek());
        }
        return minHeap.peek();
    }
}
