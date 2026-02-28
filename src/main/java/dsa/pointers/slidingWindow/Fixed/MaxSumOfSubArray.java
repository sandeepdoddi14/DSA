package dsa.pointers.slidingWindow.Fixed;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {9479,488,2374,1583,5863,7811,6916,1685,3960};
        int k =5;
        System.out.println(maxSum(arr,k));
    }

    /*
    const array length
     */
    public static int maxSum(int[] arr , int k)
    {
        int maxSum = 0;
        int windowSum = 0;
        for(int i=0;i<k;i++)
        {
            windowSum = windowSum + arr[i];
        }

        maxSum = windowSum;
        for(int i=1;i<=arr.length-k;i++)
        {
            windowSum = windowSum - arr[i-1] + arr[i+k-1];
            maxSum  = Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}
