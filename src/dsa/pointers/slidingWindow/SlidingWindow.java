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
     /*   List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(containsNearbyDuplicate(arr, 2));*/
       // divisorSubstrings(430043,2);
        String s1="ab";
        String s2 ="eidbaooo";
       // checkInclusion(s1,s2);
        int[] nums ={-1};
       // System.out.println(findMaxAverage(nums,1));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int p1=0;
        int p2=0;
        int sum=0;
        int minLengh = Integer.MAX_VALUE;
        while (p2 < nums.length)
        {
            sum = sum + nums[p2];

            while (sum >= target) {
                minLengh = Math.min(minLengh, p2 - p1 + 1);
                sum -= nums[p1];
                p1++;
            }

            p2= p2+1;
        }
        return (minLengh == Integer.MAX_VALUE) ? 0 : minLengh;
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

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        if(threshold == 0)
            return arr.length;
        double sum=0;
        int result = 0;
        for(int i=0;i<k;i++)
        {
            sum = sum +arr[i];
        }
        double avg = sum/k;
        if(avg >= threshold)
            result += 1;

        for(int j=1;j<arr.length-k;j++)
        {
            sum = sum + arr[j+k] - arr[j-1];
            if(sum/k >= threshold)
                result +=1;
        }
        return result;
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

    public static int countGoodSubstrings(String s) {
      int result = 0;
      String goodString = s.substring(0,3);
      if(goodString.chars().distinct().count() == goodString.length())
      {
          result += 1;
      }
      for (int i=3;i<s.length();i++)
        {
          goodString = goodString.substring(1,3) +   s. charAt(i);
            if(goodString.chars().distinct().count() == goodString.length())
            {
                result += 1;
            }
        }
      return result;
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

    public static int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int result=0;
        for(int i=0;i<s.length()-k+1;i++)
        {
            String temp=s.substring(i,i+k);
            int h= Integer.parseInt(String.valueOf(temp));
            if(h>0)
            {
                if(num%h==0)
                    result  = result +1;
            }
        }
        return result;
    }

    public static double findMaxAverage(int[] nums, int k) {
                int p1=0;
                int p2=p1+k-1;
                double maxLengh=Integer.MIN_VALUE;
                while(p2<nums.length)
                {
                    maxLengh= Math.max(maxLengh,sumForIndexes(nums,p1,p2,k));
                    p1 = p1+1;
                    p2 = p1+k-1;
                }
                return maxLengh;
    }

    public static double sumForIndexes(int[] nums,int p1,int p2,int k)
    {
        double result = 0;
        for(int i=p1;i<=p2;i++)
        {
            result = result + nums[i];
        }
        return result/k;
    }


   /* public static boolean checkInclusion(String s1, String s2) {
            for(int i=0;i<s2.length();i++)
            {
                for(int j=i;j<s2.length();j++)
                {
                    if(j+i+1==s1.length())
                    {
                        if(s1.contains(s2.substring(j,j+i+1)) || s1.contains(s2.substring(j,j+i+1)))
                    }
                    if(s1.contains(s2.substring(i,j)))
                    {
                        return true;
                    }

                }
              //  s1.reverse
            }
            return false;
    }
*/
}
