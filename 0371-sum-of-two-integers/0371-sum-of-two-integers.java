class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b; // common set bits
            a = a ^ b;         // sum without carry
            b = carry << 1;    // carry shifted left
        }
        return a;
    }
}