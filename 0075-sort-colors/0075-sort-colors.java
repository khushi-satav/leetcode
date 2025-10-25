class Solution {
    public void swap (int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(mid<=end){
            if(nums[mid]==0){
                swap(nums,mid,start);
                mid++;
                start++;
            }else if(nums[mid]==2){
                swap(nums,mid,end);
                
                end--;
            }else{
                mid++;
            }
        }

    
        
    }
}