class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int elem=0;
        for(int i =0;i<nums.length;i++){
            if(count == 0){
                count =1;
                elem = nums[i];
            }
            else if(nums[i] == elem){
                count++;
            }else{
                count--;
            }
        }
        count =0;
        for(int e : nums){
            if(e == elem){
                count++;
            }
        }
        if(count > (nums.length/2)){ 
            return elem;
        };

        return -1;
    }
}