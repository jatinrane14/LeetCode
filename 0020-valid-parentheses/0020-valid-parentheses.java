class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push((s.charAt(i)));
            }
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char c = st.peek();
                    st.pop();
                    if(!((s.charAt(i)==')' && c=='(')||(s.charAt(i)==']' && c=='[')||(s.charAt(i)=='}'&& c=='{'))){
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}