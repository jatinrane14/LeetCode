class Solution {
    public int[] getConcatenation(int[] nums) {
        int finalArr[]=  new int[nums.length*2];
        int j =0;
        for(int i =0;i<finalArr.length;i++){
            finalArr[i] = nums[j++];
            if(j==nums.length){
                j=0;
            }
        }
        return finalArr;
    }
}