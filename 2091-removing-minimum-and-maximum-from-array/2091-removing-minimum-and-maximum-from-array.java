class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        int left = Math.min(minIdx,maxIdx);
        int right = Math.max(minIdx,maxIdx);

        return Math.min(left+1+n-right,Math.min(right+1,n-left));
    }
}