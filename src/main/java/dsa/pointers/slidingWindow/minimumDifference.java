package dsa.pointers.slidingWindow;

import java.util.Arrays;

public class minimumDifference {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==1)
            return 0;
        int result = nums[k-1];
        for(int i=k-2;i>=0;i=i-1)
        {
            result = result - nums[i];
        }
        return result;
    }
}
