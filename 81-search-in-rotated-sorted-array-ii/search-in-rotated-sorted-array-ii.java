class Solution {
    public boolean search(int[] nums, int target) {
        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }
        return flag;
    }
}