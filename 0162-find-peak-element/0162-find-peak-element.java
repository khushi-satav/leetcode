class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;   // peak right side me hai
            } else {
                right = mid;      // peak left side me ya mid pe hai
            }
        }

        return left;
    }
}