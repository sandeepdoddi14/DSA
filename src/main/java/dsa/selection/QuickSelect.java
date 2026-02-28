package dsa.selection;

public class QuickSelect {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        System.out.println(findKtSmallest(arr, 1, 0, arr.length - 1));
    }


    //1. brute force - n2
    //2. heap - nlogk + k space complexity
    //3. quick select - o(n) most average case, n2 worst case which is rare
    public static int findKtSmallest(int[] nums, int k, int low, int high) {
        int pivotIndex = getPivotElementPosition(nums, low, high);
        if (pivotIndex == k - 1)
            return nums[pivotIndex];

        else if (pivotIndex < k) {
            return findKtSmallest(nums, k, pivotIndex + 1, high);
        } else
            return findKtSmallest(nums, k, low, pivotIndex - 1);

    }

    public static int getPivotElementPosition(int[] nums, int low, int high) {
        //  int low = 0, high = nums.length - 1;
        int pivot = high;
        int pivotElement = nums[high];

        for (int i = low; i <= high; i++) {
            if (nums[i] < pivotElement) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
               // pivot++;
            }
        }
       // int temp = nums[pivot];
        //nums[pivot] = nums[high];
        //nums[high] = temp;
        return pivot;
    }


}
