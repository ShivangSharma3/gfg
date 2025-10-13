// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        if(n==1){
            return 0;
        }
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(height[1]-height[0]);
        for(int i=2;i<n;i++){
            int jump1=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int jump2=dp[i-2]+Math.abs(height[i]-height[i-2]);
            dp[i]=Math.min(jump1,jump2);
        }
        return dp[n-1];
    }
}