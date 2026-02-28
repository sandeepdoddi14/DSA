package dsa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.LinkedList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1,1};
        System.out.println(findErrorNums(nums2));

    }

    public static int findKthPositive(int[] arr, int k) {
        int endingNumber = arr[arr.length - 1];
        int[] allNumbers = new int[endingNumber];
        for (int i = 0; i < endingNumber; i++) {
            allNumbers[i] = i + 1;
        }

        for(int i=0;i<allNumbers.length;i++){

           int isFound= binarySearch(arr,allNumbers[i]);
           if(isFound==-1){
               k=k-1;
           }
           if(k==0)
               return allNumbers[i];
        }
        return 0;
    }


    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            //return -1;
        }

        return -1;
    }


    public static int getCommon(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int start = 0;
            int end = nums2.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums2[mid] == target) {
                    return nums2[mid];
                } else if (nums2[mid] < target) {
                    start = mid + 1;
                } else if (nums2[mid] > target) {
                    end = mid - 1;
                }
            }
            // return start;
        }
        return -1;
    }

    public static int[] findErrorNums(int[] nums) {

        int duplicate = -1, missing = -1;

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                duplicate = Math.abs(nums[i]);
            else
                nums[index] = -nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                missing = i + 1; // index + 1 gives the missing number
        }

        return new int[]{duplicate, missing};

    }


}


