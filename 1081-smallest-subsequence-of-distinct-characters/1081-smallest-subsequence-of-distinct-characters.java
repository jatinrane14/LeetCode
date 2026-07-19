class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        boolean[] visited = new boolean[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            lastIndex[index] = i; 
        }
        StringBuilder res = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(visited[s.charAt(i) - 'a'])
                continue;
            if(res.isEmpty()){
                res.append(s.charAt(i));
                visited[s.charAt(i) - 'a'] = true;
            }else{
                while(!res.isEmpty() && res.charAt(res.length()-1) > s.charAt(i)){
                    if(!(lastIndex[res.charAt(res.length()-1) - 'a'] > i) ){
                        break;
                    }
                    visited[res.charAt(res.length()-1) - 'a'] = false;
                    res.deleteCharAt(res.length()-1);
                }
                if(!visited[s.charAt(i)-'a']){
                    res.append(s.charAt(i));
                    visited[s.charAt(i) - 'a'] = true;
                }
            }
        }
        return res.toString();

       
    }
}