class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int res=-1;
        for(Integer elem : freq.keySet()){
            if(freq.get(elem) ==1){
                res = elem;
            }
        }
        return res;
    }
}