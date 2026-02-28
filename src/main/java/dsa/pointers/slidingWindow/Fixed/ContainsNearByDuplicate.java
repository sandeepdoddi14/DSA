package dsa.pointers.slidingWindow.Fixed;

import java.util.HashSet;

public class ContainsNearByDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsNearbyDuplicate(int[] nums,   k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the set already contains the current number, we have a duplicate
            if (window.contains(nums[i])) {
                return true;
            }
            // Add the current number to the set
            window.add(nums[i]);

            // Maintain the size of the sliding window
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;

    }
}
