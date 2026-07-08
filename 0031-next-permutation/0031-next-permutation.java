class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // find prefix match - 1
        int breakpoint  = -1;
        for(int i =n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint ==-1){
            // reverse
            int low =0;
            int high =n-1;
            while(low<=high){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high]  = temp;
                low++;
                high--;
            }
            return;
        }

        // find elem greator than breakpoint th elem and smaller among remaing elem after breakpoint

        for(int i =n-1;i>breakpoint;i--){
            if(nums[breakpoint] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[breakpoint];
                nums[breakpoint] = temp;
                break;
            }
        } 


        // Now reverse the remaning portion

        int low =breakpoint+1;
        int high =n-1;
        while(low<=high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high]  = temp;
            low++;
            high--;
        }


    }
}