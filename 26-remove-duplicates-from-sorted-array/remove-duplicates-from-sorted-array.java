// class Solution {
//     public int removeDuplicates(int[] nums) {
//        boolean flag = true;
//        int count = 0;
//       for(int i=0;i<nums.length;i++){
//           flag = true;
//           for(int j=0;j<i;j++){
//                if(i==0){
//               flag = true;
//           }else{
//               if(nums[i] == nums[j]){
//                   flag = false;
//               }
//           }
//           }
         
//           if(flag){
//               count++;
//           }   
//       }
// int n[] = new int[nums.length];
//       flag = true;
//        int ind = 0;
//       for(int i=0;i<nums.length;i++){
//           flag = true;
//           for(int j=0;j<i;j++){
//                if(i==0){
//               flag = true;
//           }else{
//               if(nums[i] == nums[j]){
//                   flag = false;
//               }
//           }
//           }
         
//           if(flag){
//               n[ind] = nums[i];
//               ind++;
//           }   
//       }
//       return n;
//     }
// }


class Solution {
    public int removeDuplicates(int[] nums) {

        // int arr[]=int new[nums.length];

        // for(int i=0;i<)

        int a=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])continue;
            nums[a]=nums[i];
            a++;
        }
        return a;
    }
}