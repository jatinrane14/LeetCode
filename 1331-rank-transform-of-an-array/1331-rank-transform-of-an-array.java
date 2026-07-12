class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr,arr.length);
        int[] rank = new int[arr.length];
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        int r =1;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                map.put(temp[i],r);
                r++;
                continue;
            }
            if(temp[i] == temp[i-1]){
                continue;
            }
            else{
                map.put(temp[i],r++);
            }
        }

        for(int i =0;i<arr.length;i++){
            
            rank[i] = map.get(arr[i]);
        }

        return rank;
    }
}