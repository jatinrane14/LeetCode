class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                Set<Long> mid = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                        long numL =(long) target - nums[i] - nums[j] - nums[k];
                        if(mid.contains(numL)){
                            List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k],(int)numL));
                            Collections.sort(temp);
                            st.add(temp);
                        }
                        mid.add((long) nums[k]); 
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.addAll(st);
        return res;
    }
}