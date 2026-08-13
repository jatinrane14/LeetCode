class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 1){
            return nums[0]+1;
        }
        int prefixSum=nums[0];
        for(int j =1;j<nums.length;j++){
            if(nums[j] == nums[j-1]+1){
                prefixSum+=nums[j];
            }else{
                break;
            }
        }
        Set<Integer> st = new HashSet<>();
        for(int elem : nums){
            st.add(elem);
        }

        while(st.contains(prefixSum)){
            prefixSum++;
        }
        return prefixSum;
    }
}