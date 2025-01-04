class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        for(int i =0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        for(int j =n-1;j>=0;j--){
            if(target>nums[j]){
                return j+1;
            }
            if(j==0){
                return 0;
            }
        }
        return -1;
    }
};