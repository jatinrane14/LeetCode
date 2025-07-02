class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int k = low; k <= high; k++) {
            String Str = Integer.toString(k);
            int countDigit = Str.length();

            if (countDigit % 2 != 0) {
                continue;
            }

            int half = countDigit / 2;
            int rightSum = 0;
            int leftSum = 0;

            for (int i = 0; i < half; i++) {
                leftSum += Str.charAt(i) - '0';
            }

            for (int i = half; i < countDigit; i++) {
                rightSum+=Str.charAt(i)-'0';
            }

            if (leftSum == rightSum) {
                count++;
            }
        }
        return count;
    }
}