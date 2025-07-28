package dsa.recursion_backtracking.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        recursivePermutations(nums,ans,freq,ds);
        return  ans;
    }

    public void recursivePermutations(int[] nums, List<List<Integer>> ans, boolean[] freq, List<Integer> ds) {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recursivePermutations(nums, ans, freq, ds);
                ds.removeLast();;
                freq[i] = false;
            }
        }

    }
}
