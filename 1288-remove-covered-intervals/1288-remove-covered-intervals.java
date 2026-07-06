class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int result = 0;
        for(int i =0;i<intervals.length;i++){
            boolean covered = false;
            for(int j=0;j<intervals.length;j++){
                if(i==j){
                    continue;
                }
                if(intervals[j][0]<=intervals[i][0] 
                && intervals[j][1] >= intervals[i][1]){
                        covered = true;
                        break;
                }
            }
            if(!covered){
                result++;
            }
        }

        return result;
    }
}