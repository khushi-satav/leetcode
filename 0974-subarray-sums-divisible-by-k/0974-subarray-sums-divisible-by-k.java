class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int[] freq = new int[k];

        // remainder 0 initially one time present
        freq[0] = 1;

        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            prefixSum = prefixSum + nums[i];

            int rem = prefixSum % k;

            // negative remainder handle
            if(rem < 0) {
                rem = rem + k;
            }

            // same remainder already present
            count = count + freq[rem];

            // increase frequency
            freq[rem]++;
        }

        return count;
    }
}