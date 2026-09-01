class Solution {
    private void swap(int[] nums1, int[] nums2,int indx1, int indx2){
        if(nums1[indx1] > nums2[indx2]){
            int temp = nums1[indx1];
            nums1[indx1]  = nums2[indx2];
            nums2[indx2] = temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n;
        int gap = (length/2) + (length%2);
        while(gap > 0){
            int left = 0;
            int right = left+gap;
            while(right<length){
                // arr1 and arr2
                if(left<m && right >=m){
                    swap(nums1,nums2,left,right-m);
                }
                // arr2 and arr2
                else if(left>=m){
                    swap(nums2,nums2,left-m,right-m);
                }
                else{
                    swap(nums1,nums1,left,right);
                }
                left++;right++;
            }
            if(gap ==1) break;
            gap = (gap/2) + (gap%2);
        }
        int ind = m; 
        for(int i =0;i<n;i++){
            nums1[ind] = nums2[i];
            ind++;
        }
    }
}