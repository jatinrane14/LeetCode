class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;
        int i=0,j=0,k=0;
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;i++;
            }
            else{
                arr[k]=nums2[j];
                k++;j++;
            }
        }
        if(i!=m){
            for(int x=i;x<m;x++){
                arr[k]=nums1[x];
                k++;
            }
        }
         if(j!=n){
            for(int x=j;x<n;x++){
                arr[k]=nums2[x];
                k++;
            }
        }
        double val =(m+n)%2!=0?arr[((m+n)-1)/2]:(arr[((m+n)/2)]+arr[((m+n)/2)-1])/2.0;
        return val;
    }
}