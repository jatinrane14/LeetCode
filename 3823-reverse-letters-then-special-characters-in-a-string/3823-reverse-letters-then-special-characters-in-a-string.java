class Solution {
    public String reverseByType(String s) {
        int n = s.length();
        ArrayList<Character> letterRev = new  ArrayList<>();
        ArrayList<Character> symbolRev = new  ArrayList<>();

        StringBuilder res = new StringBuilder(s);
        for(char c : s.toCharArray()){
            if(c <= 'z' && c>= 'a'){
                letterRev.add(c);
            }
        }
        for(char c : s.toCharArray()){
            if(!(c <= 'z' && c>= 'a')){
                symbolRev.add(c);
            }
        }

        for(int i =0;i<res.length();i++){
            if(res.charAt(i) >='a' && res.charAt(i) <='z' ){
                 char lastLetter = letterRev.remove(letterRev.size() - 1);
                res.setCharAt(i, lastLetter);
            }else{
                char lastSymbol = symbolRev.remove(symbolRev.size() - 1);
                res.setCharAt(i, lastSymbol);
            }
        }

        return res.toString();
    }
}