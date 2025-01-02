class Solution {
public:
    int fetchValue(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
    int romanToInt(string s) {
        int n = s.length();
        int sum =0;
        for(int i = 0;i<n;i++){
            if(fetchValue(s[i])<fetchValue(s[i+1])){
                sum -= fetchValue(s[i]); 
            }
            else{
                sum += fetchValue(s[i]); 
            }
        }
        return sum;
    }
};