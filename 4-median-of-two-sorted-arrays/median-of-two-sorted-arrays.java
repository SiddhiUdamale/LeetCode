class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0.0;
       
        int len = nums1.length + nums2.length;
        int a[] = new int[len];
        
      
        for(int i=0;i<nums1.length;i++){
            a[i] = nums1[i];
        }
        int k=0;
        for(int i=nums1.length;i<len;i++){
            a[i] = nums2[k];
            k++;
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        if(len % 2 != 0){
            res =  a[len/2];
           
        }else{
           res =  ((a[len/2] + a[(len/2-1)]) / 2.0);
           
            
        }
        return res;
        
       }
       

       
    
}