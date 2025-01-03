class Solution {
public:
    bool isValid(string s) {
        stack<char> sta;
        for(int i =0;i<s.length();i++){
            if(s[i]=='(' || s[i]=='[' || s[i]=='{'){
                sta.push(s[i]);
            }
            else if(s[i]==')' || s[i]==']' || s[i]=='}'){
                if(sta.empty()){
                    return false;
                }
                else{
                    char temp = sta.top();
                    sta.pop();
                    if(!((temp == '(' && s[i] == ')') || (temp == '{' && s[i] == '}') || (temp == '[' && s[i] == ']'))){
                        return false;
                    }
                }
            }
        }
        if(sta.empty()){
             return true;
        }
       return false;
    }
};