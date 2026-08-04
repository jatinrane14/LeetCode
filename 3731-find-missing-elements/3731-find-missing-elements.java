class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int lar = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(smallest>nums[i]){
                smallest = nums[i];
            }
            if(lar<nums[i]){
                lar = nums[i];
            }
        }
        int[] hash = new int[lar+1];
        for(int elem : nums){
            hash[elem] = 1;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = smallest;i<=lar;i++){
            if(hash[i]!=1){
                res.add(i);
            }
        }

        return res;
    }
}