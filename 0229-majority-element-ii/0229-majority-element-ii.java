class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int  n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> res  = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        
        int threshold = n/3;
        for(Integer key : freq.keySet()){
            if(freq.get(key) > threshold){
                res.add(key);
            }
        }
        
        Collections.sort(res);
        return res;  
    }
}