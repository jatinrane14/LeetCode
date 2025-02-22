class Solution {
    public int missingNumber(int[] nums) {
        int expSum = (nums.length*(nums.length+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return (expSum - sum);
    }
}