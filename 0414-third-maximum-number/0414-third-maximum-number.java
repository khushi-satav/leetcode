class Solution {
    public int thirdMax(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        boolean hasMax1 = false;
        boolean hasMax2 = false;
        boolean hasMax3 = false;

        for (int i = 0; i < nums.length; i++) {

            if ((hasMax1 && nums[i] == max1) ||
                (hasMax2 && nums[i] == max2) ||
                (hasMax3 && nums[i] == max3)) {
                continue;
            }

            if (!hasMax1 || nums[i] > max1) {
                max3 = max2;
                hasMax3 = hasMax2;

                max2 = max1;
                hasMax2 = hasMax1;

                max1 = nums[i];
                hasMax1 = true;
            }
            else if (!hasMax2 || nums[i] > max2) {
                max3 = max2;
                hasMax3 = hasMax2;

                max2 = nums[i];
                hasMax2 = true;
            }
            else if (!hasMax3 || nums[i] > max3) {
                max3 = nums[i];
                hasMax3 = true;
            }
        }

        if (!hasMax3) {
            return max1;
        }

        return max3;
    }
}