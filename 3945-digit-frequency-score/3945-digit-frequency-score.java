class Solution {
    public int digitFrequencyScore(int n) {
        int count=0;
        int score=0;
        int[] hashMap = new int[10];
        while(n>0){
            int lastD = n%10;
            n/=10;
            hashMap[lastD]++;
            count++;
        }
        for(int i =0;i<hashMap.length;i++){
            if(hashMap[i]>0){
                score += (i * hashMap[i]);
            }
        }

        return score;
    }
}