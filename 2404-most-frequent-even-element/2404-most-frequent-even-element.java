class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer>  freq = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        } 
        int res = -1;
        int maxOccuranceKey = -1;
        for(Integer key : freq.keySet()){
            if(freq.get(key) >= res && key %2 == 0){
                if(res == freq.get(key)){
                    res = freq.get(key);
                    maxOccuranceKey = Math.min(maxOccuranceKey,key);
                }else{
                    res = freq.get(key);
                    maxOccuranceKey = key;
                }
            }   
        }
        return maxOccuranceKey; 
    }
}