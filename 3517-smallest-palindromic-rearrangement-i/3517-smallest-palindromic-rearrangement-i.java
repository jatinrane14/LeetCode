class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int freq[] = new int[26];
        for(int i =0;i<s.length();i++){
            char c  = s.charAt(i);
            freq[c-'a']++;
        }
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for(int i =0;i<26;i++){
            for(int j =0;j<freq[i]/2;j++){
                left.append((char)('a'+i));
            }
            if(freq[i]%2  == 1){
                middle.append((char)('a'+i));
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();

        return left.toString() + middle.toString() + right.toString();
    }
}