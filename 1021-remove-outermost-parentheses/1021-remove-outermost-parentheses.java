class Solution {
    public String removeOuterParentheses(String s) {
        String res= "";
        int count=0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                count++;
                if(count > 1){
                    res +=c;
                }
            }if(c==')' ){
                count--;
                if(count>0){
                    res +=c;
                }
            }
        }

        return res;
    }
}