import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                int pastIndex = hm.get(nums[i]);

                if(i - pastIndex <= k) {
                    return true;
                }
            }
            
            // Update latest index
            hm.put(nums[i], i);
        }

        return false;  
    }
}