class Solution {
    public int addDigits(int num) {
        int ld;
        while(true){
            int sum=0;
            while(num>0){
                ld = num%10;
                sum+=ld;
                num/=10;
            }
            if(sum>9){
                num = sum;
            }
            else{
                return sum;
            }
        }
    }
}