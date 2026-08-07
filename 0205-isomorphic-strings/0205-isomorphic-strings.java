class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Character> mp1 = new HashMap<>();
        Map<Character,Character> mp2 = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c1  = s.charAt(i);
            char c2  = t.charAt(i);

            if(mp1.containsKey(c1)){
                if(mp1.get(c1)!=c2) return false;
            }else{
                mp1.put(c1,c2);
            }

            if(mp2.containsKey(c2)){
                if(mp2.get(c2)!=c1) return false;
            }else{
                mp2.put(c2,c1);
            }
        }
        return true;
    }
}