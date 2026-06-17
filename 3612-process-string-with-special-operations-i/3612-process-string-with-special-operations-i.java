class Solution {
    public static String reverse(StringBuilder str){
        StringBuilder rev = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        String letter = "";
        for(int i =0;i<s.length();i++){
            letter = String.valueOf(s.charAt(i)); 
            if(letter.matches("[a-z]")){
                result.append(s.charAt(i));
            }else if(letter.equals("*")){
                if(result.length()>0){
                    result.deleteCharAt(result.length()-1);
                }
            } else if(letter.equals("#")){
                result.append(result);
            } else if(letter.equals("%")){
                if(result.length()>0){
                result.replace(0,result.length(),reverse(result));
                }
            }
        }

        return result.toString();
    }
}