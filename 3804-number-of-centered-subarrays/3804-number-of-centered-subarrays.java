import java.util.HashSet;

class Solution {
    public int centeredSubarrays(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> hs = new HashSet<>();
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                hs.add(nums[j]);

                if (hs.contains(sum)) {
                    count++;
                }
            }
        }

        return count;
    }
}