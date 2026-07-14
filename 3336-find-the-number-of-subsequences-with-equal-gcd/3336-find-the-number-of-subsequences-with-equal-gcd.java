class Solution {
    // Safe instance variables (wiped and recreated for every fresh object instance)
    private Integer[][][] t;
    private final int MOD = 1000000007;

    public int gcd(int a, int b) {
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }

    public int subsequencePairCount(int[] nums) {
        int n = nums.length;
        t = new Integer[n][201][201]; 
        return solve(nums, 0, 0, 0);    
    }   

    private int solve(int[] nums, int i, int first, int second) {
        if (i == nums.length) {
            return (first != 0 && second != 0 && first == second) ? 1 : 0;
        }
        if (t[i][first][second] != null) {
            return t[i][first][second];
        }

        long skip = solve(nums, i + 1, first, second);
        long take1 = solve(nums, i + 1, gcd(first, nums[i]), second);
        long take2 = solve(nums, i + 1, first, gcd(second, nums[i]));

        return t[i][first][second] = (int) ((skip + take1 + take2) % MOD);
    }

    // This is your static context!
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        // 1. Create an instance (object) of the class
        Solution solver = new Solution();

        // 2. Call the method using the object variable
        int result = solver.subsequencePairCount(nums);

        System.out.println("Result: " + result);
    }
}
