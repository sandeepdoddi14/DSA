package dsa.search.binarysearch;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            if (nums[mid] < target)
                low = mid + 1;
        }

        return low;
    }

    public static boolean searchInsertAndReturnBoolean(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[mid] > target)
                high = mid - 1;
            if (nums[mid] < target)
                low = mid + 1;
        }

        return false;
    }

    public static boolean returFistBadVersion(int[] nums) {
      /*  long low = 0;
        long high = nums.length - 1;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (isBadVersion(nums[mid]))
                return mid;
            if (isBadVersion(nums[mid]) == true)
                high = mid - 1;
            if (isBadVersion(nums[mid]) == false)
                low = mid + 1;
        }
*/
        return false;
    }

    public int arrangeCoins(int n) {
        int rows = 0;
        while (n > 0) {
            if (n >= rows) {
                rows = rows + 1;
                n = n - rows;
            }
        }
        return rows;
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        Arrays.sort(nums);
        indices.add(searchInsert(nums, target));
        return indices;
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        Boolean result = false;
        for (int ele : arr) {
            if (ele <= 0)
                result = false;
            else
                result = searchInsertAndReturnBoolean(arr, ele * 2);
            if (result == true)
                return result;
        }
        return result;
    }



}