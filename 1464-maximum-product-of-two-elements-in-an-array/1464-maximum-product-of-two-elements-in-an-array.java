class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int lar=Integer.MIN_VALUE;
        int sLar=1;
        for(int i =0;i<n;i++){
            if(nums[i]>lar){
                sLar = lar;
                lar = nums[i];
            }else if(nums[i]>sLar){
                sLar = nums[i];
            }
        }

        return (lar-1)*(sLar-1);
    }
}