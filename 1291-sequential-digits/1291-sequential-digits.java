class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String main = "123456789";
        List<Integer> res = new ArrayList<>();
        int lowCount=String.valueOf(low).length();
        int highCount= String.valueOf(high).length();

        for(int i =lowCount;i<=highCount;i++){
            for(int start =0;start+i<=9;start++){
                int dig = Integer.parseInt(main.substring(start,i+start));
                if(dig>=low && dig <=high){
                    res.add(dig);
                }
            }
        }

        return res;
    }
}