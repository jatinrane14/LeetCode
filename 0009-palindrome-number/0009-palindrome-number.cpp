class Solution {
public:
    bool isPalindrome(int x) {
        long long n = x,rev=0;
        while(n>0){
            long long digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if(rev == x){
            return 1;
        }
        return 0;
    }
};