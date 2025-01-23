class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int ld=0,rev=0;
        while(x>0){
            ld = x%10;
            rev = (rev*10)+ld;
            x/=10;
        }
        if(temp==rev){
            return true;
        } else{
            return false;
        }
    }
}