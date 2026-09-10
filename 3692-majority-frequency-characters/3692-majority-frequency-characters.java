class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        HashMap<Integer, String> groupMap = new HashMap<>();
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            groupMap.put(freq, groupMap.getOrDefault(freq, "") + ch);
        }
        String ans = "";
        int maxSize =0;
        int maxFreq = 0;
        for(int freq : groupMap.keySet()){
            String str = groupMap.get(freq);
            if(str.length() > maxSize || str.length() == maxSize && freq > maxFreq){
                ans = str;
                maxSize = str.length();
                maxFreq = freq;
            }
        }
        return ans;

    }
}