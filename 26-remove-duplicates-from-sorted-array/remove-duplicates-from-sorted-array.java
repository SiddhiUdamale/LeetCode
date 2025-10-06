class Solution {
    public int removeDuplicates(int[] nums) {
      
       int count = 0;
       int a=0;
       int n[] = new int[nums.length];
      for(int i=0;i<nums.length;i++){
           boolean flag = true;
          for(int j=i-1;j>=0;j--){
            if(nums[i]==nums[j])flag =false;
          }
          if(flag){
            nums[a]= nums[i];
            a++;
          }  
      }
      return a;
      }
    } 
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
//       return ind;
//     }
// }


// class Solution {
//     public int removeDuplicates(int[] nums) {

       
//         int a=1;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1]==nums[i])continue;
//             nums[a]=nums[i];
//             a++;
//         }
//         return a;
//     }
// }