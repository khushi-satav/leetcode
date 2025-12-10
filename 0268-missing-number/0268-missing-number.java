class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = 0;
        for (int i = 0; i < nums.length; i++) {
           expectedSum= expectedSum + nums[i];
        }

        int actualsum = nums.length * (nums.length + 1) / 2;
        int missingnum = actualsum - expectedSum;

        return missingnum;
    }
}
