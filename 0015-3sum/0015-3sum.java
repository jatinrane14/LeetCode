class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>(); 
        List<List<Integer>> res = new ArrayList<>();   
        for(int i =0;i<n;i++){
            Set<Integer> hash = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int third  = -(nums[i] + nums[j]);
                if(hash.contains(third)){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(temp);
                    st.add(temp);
                }
                hash.add(nums[j]);
            }
        }   
        res.addAll(st);
        return res;
    }
}