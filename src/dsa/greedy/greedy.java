package dsa.greedy;

import java.util.Arrays;

public class greedy {
    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
       // int result = findContentChildren(g, s);
        //System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        int[] nums = {5};
        largestSumAfterKNegations(nums,1);

    }



    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int i=0;
        while((i)!=k)
        {
            nums[0] =  nums[0]*-1;
            Arrays.sort(nums);
            i=i+1;
        }
        for(int j =0;j<nums.length;j++)
        {
            result = result + nums[i];
        }

        return result;
    }

    public static boolean validPalindrome(String s) {
        boolean isRemoved=false;
        int left = 0;
        int right =  s.length()-1;


        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                if(!isRemoved)
                {
                    if(s.charAt(left+1)==s.charAt(right)) {
                        left = left + 1;
                        isRemoved = true;
                        continue;
                    }
                    if(s.charAt(left)==s.charAt(right+1)) {

                        right = right + 1;
                        isRemoved = true;
                        continue;
                    }
                }
                return false;
            }
            left = left+1;
            right = right -1;
        }

        return  true;
    }
    public static int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i=0,j = 0;
        while((i<g.length) && (j<s.length))
        {
            if(s[j]>=g[i])
            {
                result++;
                j= j+1;
            }
            i = i+1;
        }




        return result;
    }
}
