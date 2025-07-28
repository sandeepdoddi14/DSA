package dsa.search.binarysearch;

public class kthMissingElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int target = 1;
        System.out.println(findKthPositive(nums, target));
    }

    //use binary search

    public int findKthPositiveBinaySearch(int[] arr, int k) {
        if(arr.length==1)
        {
            if(arr[0]==1)
                return 1+k;
            else
                return arr[0]-1+k-1;

        }
        int low = 0;
        int high = arr.length-1;
       int mid=0;
        while(low<=high)
        {
             mid = (low + high)/2;
            if(arr[mid]-(mid+1)<k)
            {
                low = mid +1;
            }
            if(arr[mid]-(mid+1)>k)
            {
                high = mid -1;
            }
        }

        return high+1+k;

    }

    //brute force
    // O(N),S(1)
    public static int findKthPositive(int[] arr, int k) {
        int lastElement = arr[arr.length - 1];
        int[] reference = new int[lastElement];
        for(int i=0;i<arr.length;i++) {
            reference[arr[i]-1] = 1;
        }
        int index = 0;
        while(k!=0 && index<lastElement)
        {
            if(reference[index]==1)
                index = index + 1;
            else {
                index = index + 1;
                k = k - 1;
            }
        }

        if(k!=0)
            return index+k;
        return index;
    }
}
