class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> freq1 = new HashMap<>();
        HashMap<Character,Integer> freq2 = new HashMap<>();

        for(int i =0;i<s.length();i++){
            freq1.put(s.charAt(i),freq1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i =0;i<t.length();i++){
            freq2.put(t.charAt(i),freq2.getOrDefault(t.charAt(i),0)+1);
        }
        
        for(Character c: freq2.keySet()){
            if (!freq1.containsKey(c) || freq2.get(c) > freq1.get(c)) {
    return c;
}
        }
        return '.';
    }
}