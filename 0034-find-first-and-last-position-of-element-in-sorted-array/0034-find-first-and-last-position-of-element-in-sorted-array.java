class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        int[] res = {-1,-1};
        while(first<=last){
            if(nums[first] == target && res[0] == -1) res[0] = first; if(res[0] ==-1) first++;
        
            if(nums[last] == target) res[1] = last; else last--;

            if(res[0]!= -1 && res[1]!= -1){
                break; 
            }
        }
        return res;
    }
}