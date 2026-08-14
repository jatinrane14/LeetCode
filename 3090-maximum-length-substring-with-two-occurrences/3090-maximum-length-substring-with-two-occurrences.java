class Solution {
    public int maximumLengthSubstring(String s) {
        int[] hash = new int[26];
        int left =0;
        int max=0;
        for(int right =0;right<s.length();right++){
            hash[s.charAt(right) - 'a']++;
            while(hash[s.charAt(right)-'a'] > 2){
                hash[s.charAt(left)-'a']--;
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}