class Solution {
    public int encrypt(int num){
        int temp = num;
        int maxDigit = 0;
        StringBuilder str = new StringBuilder();
        while(temp>0){
            int digit = temp%10;
            maxDigit = Math.max(maxDigit,digit);
            temp/=10;
        }
        while(num>0){
            str.append(maxDigit);
            num/=10;
        }
        System.out.println(str);
        return (Integer.parseInt(str.toString()));
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum += encrypt(nums[i]);
        }
        return sum;
    }

}