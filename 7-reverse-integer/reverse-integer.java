class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x != 0){
            int dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        if(rev > Integer.MAX_VALUE){
            return 0;
        } else if(rev < Integer.MIN_VALUE){
            return 0;
        }
        else{
        return (int)rev;
        }
        
    }
}