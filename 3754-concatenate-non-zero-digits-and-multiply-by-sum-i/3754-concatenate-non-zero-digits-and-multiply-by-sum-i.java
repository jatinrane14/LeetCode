class Solution {
    public long sumAndMultiply(int n) {
        if(n ==0 || n==1){
            return n;
        }
        int temp = n;
        int sum=0;
        String numStr = Long.toString(n);
        StringBuilder resStr = new StringBuilder();
        int i =0;
        while(temp>0){
            int ls = temp%10;
            sum+=ls;
            temp/=10;
            if (numStr.charAt(i) != '0') {
                resStr.append(numStr.charAt(i));
            }
            i++;
        }
        long digits =  Long.parseLong(resStr.toString());
        return (long)(sum * digits);
    }
}