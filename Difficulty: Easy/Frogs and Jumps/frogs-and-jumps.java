// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int res=0;
        boolean dp[]=new boolean[leaves+1];
        for(int i=0;i<N;i++){
            int jump=frogs[i];
            if(jump==0 || jump>leaves) continue;
            if(dp[jump]) continue;
            for(int j=jump;j<=leaves;j+=jump){
                dp[j]=true;
            }
        }
        for(int i=1;i<=leaves;i++){
            if(!dp[i]){
               res++;
            }
        }
        return res;
    }
}
