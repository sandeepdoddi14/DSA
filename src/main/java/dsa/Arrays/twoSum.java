package dsa.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class twoSum {

    //aproach 1 -> use hashmap

    //approach 2 -> use two pointer technique


    public boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int p1=0;
        int p2=arr.length-1;
        
        while(p2>p1)
        {
            if(arr[p1]+arr[p2]==target)
                return true;
            if(arr[p1]+arr[p2]>target)
                p2=p2-1;
            else 
                p1=p1+1;
        }
        return false;

    }

}


