package dsa.pointers.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MinSumArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(-2);
        arr.add(2);
        arr.add(-3);
        arr.add(1);
        System.out.println(minimumSumSubarray(arr,2,3));
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int p1=0;
        int p2=0;
        int result=Integer.MAX_VALUE;
        int sum = 0 ;
        while(p2<nums.size())
        {
            
            sum = sum + nums.get(p2);
            if(p2-p1+1 >=l && p2-p1+1 <=r)
            {
                result = Math.min(result, sum);
            }
            
            if(p2-p1+1>=r)
            {
                if(nums.get(p1)>0)
                    sum = sum - nums.get(p1);
                else
                    sum = sum - nums.get(p1);
                p1=p1+1;
            }
            else
            {
            
            

                            p2=p2+1;
            }
        }
        return result;
    }
    
}
