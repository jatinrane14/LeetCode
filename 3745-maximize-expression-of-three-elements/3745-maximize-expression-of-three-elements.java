class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int sLargest=0;
        int min=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>largest){
                sLargest = largest;
                largest = nums[i];
            }else if(nums[i]>sLargest && nums[i]<=largest){
                sLargest = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }

        return (largest+sLargest)-min;

    }
}