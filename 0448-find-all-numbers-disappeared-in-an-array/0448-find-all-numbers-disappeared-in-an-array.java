class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] hash = new int[nums.length+1];
        List<Integer> result = new ArrayList<>();          
        for(int i=0;i<nums.length;i++){
            hash[nums[i]] =1;
        }
        for(int i=1;i<=hash.length-1;i++){
            if(hash[i]!=1){
                result.add(i);
            }
        }
        return result;
    }
}