class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> maxMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i] > max ){
                maxMap.put(i,nums[i]);
                max = nums[i];
            }else{
                maxMap.put(i,max);
            }
        }
        HashMap<Integer,Integer> minMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i =n-1;i>=0;i--){
            if(nums[i] < min){
                minMap.put(i,nums[i]);
                min = nums[i];
            }else{
                minMap.put(i,min);
            }
        }

        for(int i =0;i<n;i++){
            if((maxMap.get(i) - minMap.get(i)) <= k){
                return i;
            }
        }
        return -1;

    }
}