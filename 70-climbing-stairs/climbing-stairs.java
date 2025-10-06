class Solution {
    public int climbStairs(int n) {
          int a = 0;
        int b = 1;
        int next = 0;
       
        
        for(int i=0;i<n+1;i++){
             
            a = b;
            b = next;
            next = a+b;
        }
    return next;
       
    }
}