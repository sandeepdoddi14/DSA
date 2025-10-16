package dsa;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Arrays {

    public static void main(String[] args) {
        int[] nums = {8};
        System.out.println((minimumOperations(nums)));

    }


    public boolean checkString(String s) {
        if (!s.contains("b"))
            return true;
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                result = true;
            } else if (s.charAt(i) == 'a') {
                if (result == true) {
                    return false;
                    // break;
                }
            }
        }
        return result;
    }

    public int pivotIndex(int[] nums) {
        int[] frontsum = new int[nums.length];
        int[] backsum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            frontsum[i] = sum;
        }
        sum = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            sum = sum + nums[j];
            backsum[j] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            if (frontsum[i] == backsum[i]) {
                return i;
            }
        }
        return -1;
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

    public static int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //S(N)
        for (int num : nums) { //O(N)
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }
        for (int key : map.keySet()) { //O(N)
            if (map.get(key) == 2) {
                result = result ^ key;
            }
        }

        return result;
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int maxSum = 0;

        for (int num : nums) {
            if (num == 1) {
                sum++;
                maxSum = Math.max(maxSum, sum);
            } else {
                sum = 0;
            }
        }
        return maxSum;

    }


    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int reduceNo=sum%k;
        if(reduceNo==0 && sum > k){
            return reduceNo;
        }
        else if(sum<k)
            return sum;

        return 0;
    }

    public static int minimumOperations(int[] nums) {
        int result = 0;
        for(int num : nums){
            int r=num%3;
            if(r<=3/2)
                result+=r;
            else
                result = result + (3-r);
        }
        return result;
    }
}
