class Solution {
    public boolean isHappy(int n) {
        HashSet set = new HashSet();
        int sum=0;
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        sum=0;
            while(n>0){
                int ld = n%10;
                n/=10;
                sum += Math.pow(ld,2);
            }
            if(sum==1){
                return true;
            }
            n=sum;
        }
        
        return n ==1;
    }
}