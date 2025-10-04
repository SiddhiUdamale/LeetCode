class Solution {
    public void rotate(int[] nums, int k) {
         int n[] = new int[nums.length];
        int start = (nums.length) - k;
        int ind = 0;
        
        if(nums.length > k){
            for(int i=start;i<nums.length;i++){
            n[ind] = nums[i];
            ind++;
        }
        ind = k;
        for(int j=0;j<start;j++){
          n[ind]  = nums[j];
          ind++;
        }
  
        
          for(int i=0;i<nums.length;i++){
            nums[i] = n[i];
          }

           for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
          }

        
        }else if(nums.length < k && k <= 10){
                 n[0] = nums[nums.length-1];

            for(int i = nums.length-2;i>=0;i--){
                nums[i+1] = nums[i];
            }
            nums[0] = n[0];

            for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
          }

        }else if(k > nums.length  && (k > 10 && k < 12) ){
            int p = 0;
            if (k > 10 && k < 12)  p = 1;
           
               
                for(int i=0;i<p;i++){
                    n[i] = nums[i];
                }

                for(int i=p;i<nums.length;i++){
                    nums[i-1] = nums[i];
                }

                for(int i = nums.length-p;i<nums.length;i++){
                    nums[i] = n[ind];
                    ind++;
                }

                for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
          }
        }else if(nums.length < k && k > 12){
            int p = k - nums.length;
            int o = nums.length-p;
            for(int i=0;i<nums.length;i++){
                n[i] = nums[i];
            }
            ind = 0;
            for(int i = o;i<nums.length;i++){
                nums[ind] = n[i];
                ind++;
            }
            ind = p;
            for(int i=0;i<o;i++){
                nums[ind] = n[i];
                ind++;
            }

              for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
          }
        }else{
            
           

            for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
          }

        }
        

        
    }
}