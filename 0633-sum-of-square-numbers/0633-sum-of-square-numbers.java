class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right =  (long)Math.sqrt(c);

        while(left<=right){
            long temp =left*left+right*right; 
            if(temp == c){
                return true;
            }else if(temp<c){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}