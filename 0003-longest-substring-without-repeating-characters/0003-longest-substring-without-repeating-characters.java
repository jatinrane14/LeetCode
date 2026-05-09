class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        HashSet<Character> set = new HashSet<>();
        int l=0,max=0,n=s.length();
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            if(max<(r-l+1)){
                max = r-l+1;
            }
        }
        return max;
    }
}