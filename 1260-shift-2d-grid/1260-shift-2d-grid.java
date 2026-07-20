class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        k = k%(n*m);

        for(int s =0;s<k;s++){
            int curr = grid[0][0];
            int prev = grid[0][0];
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    prev = curr;
                    curr = grid[i][j];
                    grid[i][j] = prev;
                }
            }
            grid[0][0] = curr;
        }

        for(int i =0;i<n;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j =0;j<m;j++){
                ls.add(grid[i][j]);
            }
            res.add(ls);
        }
        
        return res;
    }
}