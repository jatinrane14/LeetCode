class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" "); 
        StringBuilder res= new StringBuilder();
        for(int i =0;i<words.length;i++){
            if(words[i].length() == 1 || words[i].length() == 2){
                res.append(words[i].toLowerCase());
            }
            else{
                res.append(words[i].substring(0,1).toUpperCase() + words[i].substring(1,words[i].length()).toLowerCase());
            }
            if(i<words.length-1){
            res.append(" ");
            }
        }
        return res.toString();
    }
}