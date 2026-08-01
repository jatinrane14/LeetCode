class Solution {
    public static int solve(int i , int j , int[] nums){
        if(i>j){
            return 0;
        }
        if(i==j){
            return nums[i];
        }
        // Choose nums[0];
        int take_i = nums[i] + Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums)) ;
        // Choose nums[n-1];
        int take_j = nums[j] + Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums)) ;

        return  Math.max(take_i,take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i =0;i<n;i++){
            totalSum+=nums[i];
        }
         
        int player1Score = solve(0,n-1,nums);

        int player2Score = totalSum - player1Score;
        if(player1Score>=player2Score){
            return true;
        }else{
            return false;
        }
    }
}