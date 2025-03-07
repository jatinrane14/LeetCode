class Solution {
    public int encrypt(int num){
        int temp = num;
        int maxDigit = 0;
        //StringBuilder str = new StringBuilder();
        while(temp>0){
            int digit = temp%10;
            maxDigit = Math.max(maxDigit,digit);
            temp/=10;
        }
        // while(num>0){
        //     str.append(maxDigit);
        //     num/=10;
        // }
        // return (Integer.parseInt(str.toString()));
        if (num < 10)
            return maxDigit * 1;
        else if (num >= 10 && num <= 99)
            return maxDigit * 11;
        else if (num >= 100 && num <= 999)
            return maxDigit * 111;
        else if (num == 1000)
            return maxDigit * 1111;


        return -1;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum += encrypt(nums[i]);
        }
        return sum;
    }

}