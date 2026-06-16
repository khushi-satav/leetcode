class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        for(int nz=0;nz<nums.length;nz++){
            if(nums[nz]!=0){
                int temp=nums[nz];
                nums[nz]=nums[z];
                nums[z]=temp;
                z++;
            }
        }
    }
}