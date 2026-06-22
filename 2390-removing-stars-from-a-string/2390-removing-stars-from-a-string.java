class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}