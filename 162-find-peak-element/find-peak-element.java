class Solution {
    public int findPeakElement(int[] nums) {
        int large = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > large){
                large = nums[i];
                index = i;
            }
        }
        return index;
    }
}