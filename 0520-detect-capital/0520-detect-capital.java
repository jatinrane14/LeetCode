class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int countUpperCase =0;
        for(int i =0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) countUpperCase++; 
        }

        return countUpperCase ==n || 
                countUpperCase == 0 || 
                (countUpperCase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}