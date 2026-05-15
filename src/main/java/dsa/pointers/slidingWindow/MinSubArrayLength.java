package dsa.pointers.slidingWindow;

public class MinSubArrayLength {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int p1=0;
        int p2=0;
        while(p2<nums.length)
        {   
            sum = sum + nums[p2];
            while(sum >= target)
            {
                minLength = Math.min(minLength, p2-p1+1);
                sum = sum - nums[p1];
                p1 = p1+1;
            }
            //else
            //{
            
                p2= p2+1;
            
            
            //}
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
       
    }
}
