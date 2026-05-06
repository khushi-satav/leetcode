import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int req_num = target - nums[i];

            if (hm.containsKey(req_num)) {   // ✅ K capital
                return new int[]{hm.get(req_num), i};  // ✅ semicolon fix
            }

            hm.put(nums[i], i);  // ✅ semicolon add
        }

        return new int[]{}; // better than null
    }
}