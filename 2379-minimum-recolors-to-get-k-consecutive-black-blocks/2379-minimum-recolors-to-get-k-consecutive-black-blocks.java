class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start = 0;
        int window = k-1;
        int minRes = Integer.MAX_VALUE;
        int count=0;
        for(int i =0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                count++;
            }
        }
        minRes = Math.min(count,minRes);

        while(window<blocks.length() && (window+1)<blocks.length()){
            if(blocks.charAt(start) == 'W') {
                count--;
            }
            start++;
            window++;
            if(blocks.charAt(window) == 'W'){
                count++;
            }
            minRes = Math.min(count,minRes);
        }
        return minRes;
    }
}