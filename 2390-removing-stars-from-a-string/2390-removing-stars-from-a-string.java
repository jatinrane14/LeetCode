class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for(int i =0;i<s.length();i++){
            // new
            if(s.charAt(i) == '*' && !result.isEmpty()){
                result.deleteCharAt(result.length()-1);
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}