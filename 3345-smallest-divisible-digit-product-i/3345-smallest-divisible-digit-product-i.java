class Solution {
    private int findProductOfDigit(int d){
        int ans=1;
        while(d>0){ 
            int ld = d%10;
            ans*=ld;
            d/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        while(findProductOfDigit(n)%t!=0){
            n++;
        }
        return n;
    }
}