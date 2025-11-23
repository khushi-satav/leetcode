class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        // square the numbers
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length - 1;
        int pos = nums.length - 1;

        while(head <= tail){
            if(nums[head] > nums[tail]){
                result[pos] = nums[head];
                head++;
            } else {
                result[pos] = nums[tail];
                tail--;
            }
            pos--;   // ❗ MUST DECREASE
        }

        return result;
    }
}
