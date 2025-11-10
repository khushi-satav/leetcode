class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            // Right half sorted
            else {
                if (nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
