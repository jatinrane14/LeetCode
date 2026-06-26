class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int elem : nums){
            hash.put(elem,hash.getOrDefault(elem,0)+1);
        }
        for(Integer elem : hash.keySet()){
            if(hash.get(elem) > (nums.length/2)) return elem;
        }

        return -1;
    }
}