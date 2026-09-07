class Solution {
    public int countValidPrefixes(String s) {
        int zeros =0;
        int ones = 0;
        int ans=0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                ones++;
            }else{
                zeros++;
            }

            if(Math.abs((ones - zeros))<=1 ){
                ans++;
            }
        }
        return ans;
    }
}