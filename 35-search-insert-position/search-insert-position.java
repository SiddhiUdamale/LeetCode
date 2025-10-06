class Solution {
    public int searchInsert(int[] nums, int target) {
        int index  = -1;
       for(int i=0;i<nums.length;i++){
        if(target == nums[i]){
            index = i;
            break;
        }
       } 
       if(index == -1){
        for(int i=1;i<nums.length;i++){
          
            if(target > nums[i-1] && target < nums[i]){
                index = i;
                break;
            }
        }
       }if(index == -1){
            if(target > nums[nums.length-1]){
        index = nums.length;
       }else if(target < nums[0]){
        index = 0;
       }
       }
       
       return index;
    }
}