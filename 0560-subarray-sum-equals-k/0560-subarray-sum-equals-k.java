class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashMp = new HashMap<>(); 
        hashMp.put(0,1);
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(hashMp.containsKey(sum-k)){
                count+=hashMp.get(sum-k);
            }
            hashMp.put(sum,hashMp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}