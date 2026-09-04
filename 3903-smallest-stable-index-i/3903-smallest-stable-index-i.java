class Solution {
    private static  int findMinInArray(int arr[] , int startIndex,int n ){
        int min = Integer.MAX_VALUE;
        for(int i =startIndex;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    private static int findMaxInArray(int arr[] , int endIndex,int n){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<=endIndex;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n ==1 && nums[0]-nums[0] <= k){
            return 0;
        }
        for(int i =0;i<n;i++){
            int max = findMaxInArray(nums,i,n);
            int min = findMinInArray(nums,i,n);
            if((max-min)<=k){
                return i;
            }
        }
        return -1;
    }
}