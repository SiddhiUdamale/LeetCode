class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind1 = -1;
        int ind2 = -1;
        int l = 0;
        int r = numbers.length-1;
      while(l < r){
        int sum = numbers[l]+numbers[r];
        if(sum == target){
            ind1 = l + 1;
            ind2 = r + 1;
            break;
        }else if(sum < target){
            l ++;
        }else{
            r--;
        }
      }
      return new int[]{ind1,ind2};
    }
}