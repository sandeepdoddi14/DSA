package dsa.greedy;

import java.util.Arrays;

public class greedy {
    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        int[] temp= {0,1,0};
        String ss= "0101";
       // int result = findContentChildren(g, s);
        System.out.println(maximumOddBinaryNumber(ss));
        //int[] nums = {5};
        //largestSumAfterKNegations(nums,1);

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
            if(s.length()<2)
                return false;
            int count=0;
            Boolean isEvenPresent = false;
            int[] countingArray = new int[26];
            for(int i=0;i<s.length();i++)
            {
                countingArray[s.charAt(i)-'a']++;
            }

            for(int i=0;i<countingArray.length;i++)
            {
                if(countingArray[i]==0)
                    continue;
                if(countingArray[i]%2==0)
                    isEvenPresent = true;
                if(countingArray[i]%2==1)
                    count++;

            }
            return isEvenPresent && count<3;
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

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int num:arr)
            sum+=num;

        return (sum%3)==0;
    }

    public static String maximumOddBinaryNumber(String s) {
        int noOfOnes = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                noOfOnes++;
        }

        StringBuilder replacedString=new StringBuilder(s.length());

        while(noOfOnes>0)
        {
            if(noOfOnes==1) {
                while(replacedString.length()+1!=s.length())
                    replacedString.append('0');
                replacedString.insert(s.length() - 1, '1');
            }
            else
                replacedString.append('1');
            noOfOnes--;
        }
        return replacedString.toString();

    }


}
