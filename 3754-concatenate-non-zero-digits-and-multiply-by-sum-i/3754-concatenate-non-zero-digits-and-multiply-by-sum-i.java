class Solution {
    public long sumAndMultiply(int n) {
        if(n ==0 || n==1){
            return n;
        }
        int sum=0;
        int place =1;
        long newN = 0;
        while(n>0){
            int ld = n%10;
            if(ld!=0){
                sum+=ld;
                newN = ld*place+newN;
                place*=10;
            }
            n/=10;
        }

        return newN*sum;

    }
}