package dsa.search;

public class BinarySearch {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + high / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            if (nums[mid] < target)
                low = mid + 1;
        }

        return low;
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


}
