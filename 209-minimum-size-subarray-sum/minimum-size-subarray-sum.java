class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int start = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int end = 0;end<nums.length;end++){
            sum = sum + nums[end];
            while(sum >= target){
                int clen = end - start + 1;
                if(clen < minlen){
                    minlen = clen;
                }
                sum = sum - nums[start];
                start++;
            }
        }

        int result = (minlen == Integer.MAX_VALUE)? 0:minlen;
        return result;
        
    }
}