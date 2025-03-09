class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount=0;
        for (int digit : nums) {
            if (digit==1) {
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}