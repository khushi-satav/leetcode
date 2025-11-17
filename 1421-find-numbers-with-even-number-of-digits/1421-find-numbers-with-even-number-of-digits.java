class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int digits = String.valueOf(nums[i]).length();  // number ka digit count

            if(digits % 2 == 0) {   // even digit count
                count++;
            }
        }

        return count;
    }
}
