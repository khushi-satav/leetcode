import java.util.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> special = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {

                if (seen.contains(nums[i])) {
                    special.remove(nums[i]);
                } else {
                    seen.add(nums[i]);
                    special.add(nums[i]);
                }
            }
        }

        return special.size();
    }
}