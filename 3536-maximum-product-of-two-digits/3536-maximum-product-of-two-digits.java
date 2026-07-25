class Solution {
    public int maxProduct(int n) {
        int max1=Integer.MIN_VALUE,max2=1;
        while(n>0){
            int d = n%10;
            if(max1<=d){
                max2 = max1;
                max1 = d;
            }else if(max2<d){
                max2 = d;
            }
            n/=10;
        }
        return max1*max2;
    }
}