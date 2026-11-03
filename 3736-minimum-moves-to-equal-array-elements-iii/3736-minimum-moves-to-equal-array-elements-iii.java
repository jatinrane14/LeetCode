class Solution {
    public int minMoves(int[] nums) {
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max) max = nums[i];
        }
        int moves = 0;
        for(int i =0;i<nums.length;i++){
            int diff = Math.abs(nums[i] - max);
            moves+=diff;
        }
        return moves;
    }
}