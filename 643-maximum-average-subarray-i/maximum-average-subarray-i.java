class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
       
        double mavg = 0.0;
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        mavg = sum / k;

        double avg = 0.0;
        for(int i=k;i<nums.length;i++){
            sum = sum + nums[i] - nums[i-k];
            avg = sum / k;
            if(mavg < avg){
                mavg = avg;
            }
        }
        return mavg;
    }
}