class Solution {
    public int addDigits(int num) {
        
        while(num >= 10  ){
           int sum = 0;
            while(num != 0){
                 int dig = num % 10;
                 sum = sum + dig;
                 num = num / 10;
            }
           num = sum;
        }
        return num;
        
    }
}