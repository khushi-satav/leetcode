class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int []result=new int[n];
        int positiveInd=0,negativeInd=1;
        for( int num:nums)
        if(num>0){
            result[positiveInd]=num;
            positiveInd+=2;
        }else{
            result[negativeInd]=num;
            negativeInd+=2;
        }
        return result;
        
    }
}