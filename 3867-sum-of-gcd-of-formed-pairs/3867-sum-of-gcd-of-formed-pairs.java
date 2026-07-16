class Solution {
    private int gcd(int a, int b){
        return (b==0)? a: gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = -1;
        int[] prefixGcd = new int[n];

        for(int i =0;i<n;i++){
            max = Math.max(nums[i],max);
            prefixGcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGcd);
        long sum =0;
        int low = 0;
        int high  = n-1;
        while(low<high){
            sum+=gcd(prefixGcd[low++],prefixGcd[high--]);
        }

        return sum;
    }
}