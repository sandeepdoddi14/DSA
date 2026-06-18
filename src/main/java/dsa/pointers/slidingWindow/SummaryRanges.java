package dsa.pointers.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int p1=0;
        int p2=0;
        while(p2<nums.length)
        {
            if(p1==nums.length-1)
            {
                result.add(nums[p2]+"");
                break;

            }
            if(nums[p2]!=nums[p2+1]-1)
            {
                result.add(nums[p1]+"->"+nums[p2]);
                p1=p1+1;
                p2=p2+1;

            }
            else
                p2 = p2+1;
        }
        
        return result;
    }
    
}
