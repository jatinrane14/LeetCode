class Solution {
    public static int recursiveSearch(int arr[],int tar,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] == tar){
            return mid;
        }
        else if(arr[mid]<tar){
            return recursiveSearch(arr,tar,mid+1,high);
        }
        return recursiveSearch(arr,tar,low,mid-1);
    }
    public int search(int[] nums, int target) {
        return recursiveSearch(nums,target,0,nums.length-1);
    }
}