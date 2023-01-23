
/*https://leetcode.com/problems/number-of-provinces/description/*/
class Solution {
    public static void dfs(int node,ArrayList<Integer>[] adj,int vis[]){
        vis[node]=1;
        for(int it:adj[node]){
            if(vis[it]==0){
                dfs(it,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
                ArrayList<Integer>[] adj = new ArrayList[n];
for(int i = 0; i < n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj[i].add(j);
                    adj[j].add(i);
                }
            }
        }
        int vis[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                c++;
                dfs(i,adj,vis);
            }
        }
        return c;
    }
}
