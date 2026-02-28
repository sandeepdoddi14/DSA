package dsa.pointers;

public class KandansAlgorithm_MaxSubArraySum {

    public static void main(String[] args) {
    }

    static int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0)
                sum = 0;
        }


        return maxSum;
        
    }

}
