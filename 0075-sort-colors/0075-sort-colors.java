class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {   // ✅ fix
            switch (nums[mid]) {   // ✅ switch add kiya
                
                case 0:
                    swap(nums, start, mid);  // ✅ end nahi, mid
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);   // ✅ start nahi, mid
                    end--;
                    break;
            }
        }
    }

    private void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}