class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] hashArr = new int[10];
        while(n>0){
            int ld = n%10;
            n/=10;
            hashArr[ld]++;
        }
        int least = Integer.MAX_VALUE;
        int leastIndex = 0;
        for(int i=0;i<hashArr.length;i++){
            if(hashArr[i]==0) continue;
            if(hashArr[i]<least){
                least = hashArr[i];
                leastIndex = i;
            }
        }
        return leastIndex;
    }
}