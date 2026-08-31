class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = 0;
        while(left>=0 && right < n){
    
            if(nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        
        int j = m;

        for (int i = 0; i < n; i++) {
            nums1[j] = nums2[i];
            j++;
        }

        Arrays.sort(nums1);


    }
}