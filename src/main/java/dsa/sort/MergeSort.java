package dsa.sort;

/*
1. divide and coquer
2. n logn both average and worst case
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arry = new int[]{
                2, 3, 6, 1
        };
        mergeSort(arry, 0, 3);
        System.out.println(arry.length);
    }


    public static void mergeSort(int[] array, int left, int right) {
        if (array.length < 2) {
            return;
        }
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }

    }

    // Method to merge two subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = array[mid + 1 + j];

        // Merge the temp arrays

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }


    //[1,3]  [2,4]
    private static void mergeArray(int[] nums, int l, int mid, int h) {
        int[] mergedArray = new int[h - l + 1];

        int left = l;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= h) {
            if (nums[left] < nums[right]) {
                mergedArray[k] = nums[l];
                k = k + 1;
                left = left + 1;
            } else {
                mergedArray[k] = nums[right];
                k = k + 1;
                right = right + 1;
            }
        }

        while (left <= mid) {
            mergedArray[k] = nums[left];
            left = left + 1;
            k = k + 1;

        }
        while (right <= h) {
            mergedArray[k] = nums[h];
            right = right + 1;
            k = k + 1;
        }

        for (int ind = l; ind <= h; ind++) {
            nums[ind] = mergedArray[ind - l];
        }


    }


}
