class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long val = 1;
        ans.add(1);
        for(int c= 1;c<rowIndex+1;c++){
            val= val*(rowIndex+1-c);
            val = val/(c);
            ans.add((int)val);
        }
        return ans;
    }
}