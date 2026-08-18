class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        int left =0;
        for(int right = k-1;right<nums.length;right++){
            Set<Integer> st = new HashSet<>();
            for(int i = left;i<=right;i++){
                if(!st.contains(nums[i])){
                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                    st.add(nums[i]);
                }
            }
            left++;
        }
        int res=-1;
        for(int key : map.keySet()){
            if(map.get(key)==1){
                res = Math.max(res,key);
            }
        }

        return res;
    }
}