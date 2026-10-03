class Solution {
    public int distributeCandies(int[] candyType) {

        int n  = candyType.length;
        HashSet<Integer> st = new HashSet<>();
        int allowedCount = n/2;
        for(int i =0;i<n;i++){
            st.add(candyType[i]);
        }

        int distictCandyFreq = st.size();
        
        if(distictCandyFreq < allowedCount){
            return distictCandyFreq;
        }
        return allowedCount;
    }
}