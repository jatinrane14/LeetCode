class Solution {
    public int reverse(int x) {
        int temp =x,rev=0,ld;
        boolean flag = false;
        if(x<0){
            temp = x*(-1);
            flag = true;
        }
        while(temp>0){
            ld = temp%10;
            temp/=10;
            if(rev> Integer.MAX_VALUE/ 10 || (rev == Integer.MAX_VALUE/10 && ld > 7)){
                return 0;
            }
            if(rev< Integer.MIN_VALUE/ 10 || (rev == Integer.MIN_VALUE/10 && ld > -8)){
                return 0;
            }
            rev = rev*10+ld; 
        }
        if(flag){
            return rev*(-1);
        }
        return rev;
    }
}