class Solution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int sorted[][] = new int[n][2];
        for(int i=0;i<n;i++){
            sorted[i][0] = nums[i]; 
            sorted[i][1] = i; 
        }
        Arrays.sort(sorted,(a,b)->Integer.compare(a[0],b[0]));
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i =0;i<n;i++){
            hs.put(sorted[i][1],i);
        }

        int LOG = 1;
        while( (1<<LOG) < n){
            LOG++;
        }
        int up[][] = new int[n][LOG];
        int r=0;
        for(int left = 0;left<n;left++){
            if(r<left){
                r=left;
            }
            while(r+1<n && sorted[r+1][0] -sorted[left][0] <=maxDiff) r++;

            up[left][0] =r;

        }

        for(int i= 1;i<LOG;i++){
            for(int j = 0;j<n;j++){
                up[j][i] = up[up[j][i-1]][i-1];
            }
        }

        int ans[] = new int[queries.length];
        for(int i =0;i<queries.length;i++){
            int src = hs.get(queries[i][0]);
            int dest= hs.get(queries[i][1]);
            if(src>dest){
                int temp = src;  
                src= dest;
                dest = temp;
            }
            if(src==dest) {
                ans[i]=0;
                 continue;
            } 
            

            int curr = src;
            int hops = 0;

            for(int j =LOG-1;j>=0;j--){
                if(up[curr][j]<dest){
                    curr= up[curr][j];
                    hops+=(1<<j);
                }

            }
            if(up[curr][0] >= dest){
                ans[i]  = hops+1;
            }else{  
                ans[i] = -1;
            }
        }
        return ans;

    }
}