class Solution {
    public int missingNumber(int[] nums) {
      Arrays.sort(nums);
      int ind = 0;
      int miss = -1;
      for(int i=0;i<=nums.length;i++){
        if(ind == nums.length){
            miss = i;
            break;
        }
             if(nums[ind] == i){
                ind++;

        }else{
            miss = i;
           
        }
        
       
      }
      return miss;
    }
}