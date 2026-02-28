package dsa.sort;

import java.util.Arrays;

// non comparision sorting
// array range is provided
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {5,0,10,0,10,6};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    public static int[] countingSort(int[] arr)
    {
        int[] sortedArray= new int[101];
        for(int i=0;i<arr.length;i++)
            sortedArray[arr[i]]++;

        return sortedArray;
    }

    //O(n+K)
    public static int heightChecker(int[] heights) {
        int[] countingArray=countingSort(heights); //o[n)
        int[] expectedArray = new int[heights.length]; //+ k ==100
        int index=0;
        for(int i=1;i<countingArray.length;i++)
        {
            if(countingArray[i]!=0) {
                while (countingArray[i] > 0) {
                    expectedArray[index] = i;
                    countingArray[i]--;
                    index++;
                }
            }
        }
        int result=0;
        for(int i=0;i<expectedArray.length;i++)
        {
            if(expectedArray[i]!=heights[i])
                result++;
        }
        return result;
    }


    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countingSortArray=countingSort(nums);
        int[] expectedArray = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int ii=0;ii<nums[i];ii++)
            {
                if(countingSortArray[ii]!=0)
                    sum+=countingSortArray[ii];
            }
            expectedArray[i]=sum;
        }
        return expectedArray;
    }
}
