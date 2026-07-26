class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;


        for(int i =0;i<nums.length;i++){
            if(max1<=nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(max2<=nums[i]){
                max3 = max2;
                max2 = nums[i];
            }else if(max3<=nums[i]){
                max3 = nums[i];
            }
            if(min1>=nums[i]){
                min2 = min1;
                min1 = nums[i];
            }else if(min2>=nums[i]){
                min2 = nums[i];
            }
        }

        int res1 = max1*max2*max3;
        int res2 = min1*min2*max1;
        return Math.max(res1,res2);
    }
}