class Solution {
    public int[] getConcatenation(int[] nums) {
        int finalArr[]=  new int[nums.length*2];
        for(int i =0;i<nums.length;i++){
            finalArr[i] = nums[i];
            finalArr[i+nums.length] =nums[i]; 
        }
        return finalArr;
    }
}