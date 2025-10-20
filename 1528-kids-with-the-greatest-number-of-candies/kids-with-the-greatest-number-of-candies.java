class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        boolean flag = true;
       int large = Integer.MIN_VALUE;
       for(int m:candies){
        if(m >= large){
            large = m;
        }
       }
       for(int i=0;i<candies.length;i++){
        int extra = candies[i] + extraCandies;
        if(extra >= large){
            flag = true;
            result.add(flag);
        }else{
            flag = false;
            result.add(flag);
        }
       }
       return result;
    }
}