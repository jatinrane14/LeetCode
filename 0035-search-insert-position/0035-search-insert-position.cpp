class Solution {
public:
    int BinarySearch(vector<int>& arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return BinarySearch(arr, target, low, mid - 1);
        }
        return BinarySearch(arr, target, mid + 1, high);
    }
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        BinarySearch(nums, target, 0, n - 1);
        for (int j = n - 1; j >= 0; j--) {
            if (target > nums[j]) {
                return j + 1;
            }
            if (j == 0) {
                return 0;
            }
        }
        return -1;
    }
};