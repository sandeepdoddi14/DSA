package dsa.pointers.slidingWindow;

public class MinSubArrayLength {
    public static void main(String[] args) {

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int p1=0;
        int p2=0;
        int currentsum =0;
        while(p2<nums.length)
        {
            currentsum = currentsum + nums[p2];

            while (currentsum >= target) {
                minLength = Math.min(minLength, p2 - p1 + 1);
                currentsum -= nums[p1];
                p1++;
            }

            p2 = p2 + 1;
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }


    public static int minSubArrayLen1(int target, int[] nums) {
       int p1=0;
       int p2=0;
       int sum = 0;
       int result = Integer.MAX_VALUE;
    
       while(p2<nums.length)
       {
        sum = sum + nums[p2];
        
        if(sum>target)
        {
        
            sum = sum - nums[p1];
            p1=p1+1;
        }

        if(sum==target)
        {
            result = Math.min(p2-p1+1, result);
        }

        p2=p2+1;
       }

       return result;
    }
}
