class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(nums[0]);
        l2.add(nums[1]);

        for(int i =2;i<n;i++){
            if(l1.getLast() > l2.getLast()){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }

        int[] res = new int[n];
        int index=0;
        for(Integer elem : l1){
            res[index] = elem;
            index++;
        }
        for(Integer elem : l2){
            res[index] = elem;
            index++;
        }

        return res;
    }
}