class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[n];
        boolean[] suspecious = new boolean[n];

        for(int[] edge : invocations){
            int u = edge[0];
            int v  = edge[1];
            adj.get(u).add(v);
            inDegree[v]++;
        }

        // BFS
        Queue<Integer> que = new LinkedList<>();
        que.offer(k);
        suspecious[k] = true;

        while(!que.isEmpty()){
            int curr = que.poll();
            for(int neighbour : adj.get(curr)){
                inDegree[neighbour]--;
                if(!suspecious[neighbour]){
                    suspecious[neighbour] = true;
                    que.offer(neighbour); 
                }
            }
        }

        boolean cannotRemove = false;
        List<Integer> res = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(suspecious[i] && inDegree[i]>0){
                cannotRemove = true;
                break;
            }
            if(!suspecious[i]){
                res.add(i);
            }
        }
        if(cannotRemove){
            List<Integer> lst = new ArrayList<>(); 
            for(int j =0;j<n;j++){
                lst.add(j);
            }    
            return lst;
        }

        
        return res;
    }
}