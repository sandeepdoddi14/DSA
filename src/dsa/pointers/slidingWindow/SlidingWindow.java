package dsa.pointers.slidingWindow;

import java.util.ArrayList;
import java.util.List;


public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        String s = "au";
        //
        //System.out.println(longestSubArrayLength(arr, 14));
        // printAllSubArrays(arr);
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(containsNearbyDuplicate(arr, 2));
    }


    public static int longestSubArrayLength(int[] arr, int k) {
        int sum = 0;
        int p1 = 0;
        int p2 = 0;
        int maxLen = 0;
        while (p2 < arr.length) {
            sum = sum + arr[p2];
            if (sum > k) {//this is optimal instead using while loop is better
                sum = sum - arr[p1];
                p1 = p1 + 1;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen, p2 - p1 + 1);
            }
            p2 = p2 + 1;
        }
        return maxLen;
    }


    public static int longestSubStringWithoutDuplicates(String s) {
        if (s.length() == 1)
            return 1;
        int p1 = 0;
        int p2 = 0;
        StringBuilder subStr = new StringBuilder();
        int maxLen = 0;

        while (p2 < s.length()) {
            //string temp=s.charAt(p2)+""
            if (subStr.indexOf(s.charAt(p2) + "") == -1) {
                subStr.append(s.charAt(p2));
            } else {
                maxLen = Math.max(maxLen, subStr.length());
                subStr.delete(0, subStr.indexOf(s.charAt(p2) + "") + 1);
                subStr.append(s.charAt(p2));
            }

            p2 = p2 + 1;
        }
        maxLen = Math.max(maxLen, subStr.length());

        return maxLen;
    }

    public static void printAllSubArrays(int[] arr) {
        for (int p1 = 0; p1 < arr.length; p1++) {
            for (int p2 = p1; p2 < arr.length; p2++) {
                for (int i = p1; i <= p2; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(); // new array
            }
        }
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = 0;
        for (int p1 = 0; p1 < nums.size(); p1++) {
            for (int p2 = p1; p2 < nums.size(); p2++) {
                if (p2 - p1 + 1 >= l && p2 - p1 + 1 <= r) {
                    int sum = 0;
                    for (int i = p1; i <= p2; i++) {
                        sum += nums.get(i);
                    }
                    if (sum > 0 & result == 0) {
                        result = sum;
                    } else if (sum > 0) {
                        result = Math.min(result, sum);
                    }
                }
            }
        }
        return result == 0 ? -1 : result;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int p1=0;
        int p2=1;
        while(p2<nums.length){
            while(nums[p1]!=nums[p2] && p2<nums.length){
                p2=p2+1;
            }
            if(p2-p1>k)
                p1=p1+1;

            if(nums[p1]==nums[p2] && p2-p2<=k){
                return true;
            }

        }
        return false;
    }

}
