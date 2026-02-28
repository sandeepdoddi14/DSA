package dsa.pointers.slidingWindow;

import java.util.ArrayList;
import java.util.List;


public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        String s = "au";
        //
        //System.out.println(longestSubArrayLength(arr, 14));
        // printAllSubArrays(arr);
     /*   List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        // divisorSubstrings(430043,2);
        // String s1="ab";
        //String s2 ="eidbaooo";
        // checkInclusion(s1,s2);
        //int[] nums ={-1};
        // System.out.println(findMaxAverage(nums,1));
        //System.out.println(countGoodSubstrings("aababcabc"));
        int[] ss = {2,2,2,2,5,5,5,8};
        //System.out.println(numOfSubarrays(ss, 3,4));
*/

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int minLengh = Integer.MAX_VALUE;
        while (p2 < nums.length) {
            sum = sum + nums[p2];

            while (sum >= target) {
                minLengh = Math.min(minLengh, p2 - p1 + 1);
                sum -= nums[p1];
                p1++;
            }

            p2 = p2 + 1;
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
        String goodString = s.substring(0, 3);
        if (goodString.chars().distinct().count() == goodString.length()) {
            result += 1;
        }
        for (int i = 3; i < s.length(); i++) {
            goodString = goodString.substring(1, 3) + s.charAt(i);
            if (goodString.chars().distinct().count() == goodString.length()) {
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


    public static int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int result = 0;
        for (int i = 0; i < s.length() - k + 1; i++) {
            String temp = s.substring(i, i + k);
            int h = Integer.parseInt(String.valueOf(temp));
            if (h > 0) {
                if (num % h == 0)
                    result = result + 1;
            }
        }
        return result;
    }

    public static double findMaxAverage(int[] nums, int k) {
        int p1 = 0;
        int p2 = p1 + k - 1;
        double maxLengh = Integer.MIN_VALUE;
        while (p2 < nums.length) {
            maxLengh = Math.max(maxLengh, sumForIndexes(nums, p1, p2, k));
            p1 = p1 + 1;
            p2 = p1 + k - 1;
        }
        return maxLengh;
    }

    public static double sumForIndexes(int[] nums, int p1, int p2, int k) {
        double result = 0;
        for (int i = p1; i <= p2; i++) {
            result = result + nums[i];
        }
        return result / k;
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

    public static int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String subString = s.substring(i, j + 1);
                int zs = 0;
                int os = 0;
                for (int index = 0; index < subString.length(); index++) {
                    if (subString.charAt(index) == '0')
                        zs++;
                    else
                        os++;
                }
                if (!(zs > k && os > k))
                    count++;

            }
        }
        return count;
    }

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k > 0) {
            int start = 1;
            int end =  k;
            while (start <= end) {
                result[0] = result[0] + code[start];
                start++;
            }
            for (int i = 1; i < code.length; i++) {
                result[i] = result[i - 1] - code[start] + code[(end+i)%code.length];
            }

        }
        if (k < 0) {

            int start = code.length - Math.abs(k);
            int end =  code.length - 1;
            while (start <= end) {
                result[0] = result[0] + code[start];
                start++;
            }
            start = code.length - Math.abs(k);
            for (int i = 1; i < code.length; i++) {
                result[i] = result[i - 1] - code[start] + code[(end+1+code.length)%code.length];
                start = (start +1)%code.length;
                end = (end +1)%code.length;
            }

            start = start +1;
            end = (end +1)%code.length;

        }
        if (k == 0) {
            for (int i = 0; i < code.length; i++)
                result[i] = 0;
        }
        return result;
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int result = 0 ;
        int sum = 0;
        for( int i =0;i<k;i++)
        {
            sum = sum + arr[i];
        }

        if(sum/k>=threshold)
            result = result +1;

        for(int j=1;j<=arr.length-k;j++)
        {
            sum =  sum - arr[j-1] + arr [j+k-1];
            if(sum/k>=threshold)
                result = result +1;
        }

        return result;
    }
}
