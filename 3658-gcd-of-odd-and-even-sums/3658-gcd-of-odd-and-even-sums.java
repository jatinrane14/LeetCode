class Solution {
    private static int gcd(int a, int b){
        return (b == 0) ? Math.abs(a) : gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        
        int evenCount = n/2;
        int sumEven = n*(n+1);
        return gcd(sumOdd,sumEven);
    }
}