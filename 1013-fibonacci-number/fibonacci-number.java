class Solution {
    int a = 0;
    int b = 1;
    public int fib(int n) {
        
        if(n==0) return 0;
        if(n==1) return 1;
        else{
            int a = 0;
            int b = 1;
            int next = 0;
        for(int i=1;i<n;i++){
           
            next  = a+b;
            
            a=b;
            b = next;
        }
         return next;
        }
       
    }
}