class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        return gcd(nums[left], nums[right]);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}