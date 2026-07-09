class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int q = queries.length;
        int[] comp = new int[n]; 
        boolean[] res = new boolean[q];
        for(int i=1;i<n;i++){
            int diff = Math.abs(nums[i] - nums[i-1]);
            if(diff<=maxDiff){
                comp[i] = comp[i-1];
            }else{
                comp[i] = i;
            }
        }
        for(int i =0;i<q;i++){
            int first = queries[i][0];            
            int last = queries[i][1];
            if(comp[first] == comp[last] ){
                res[i] = true;
            }
        }

        return res;
    }
}