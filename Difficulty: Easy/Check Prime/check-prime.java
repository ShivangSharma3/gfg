class Solution {
    public static boolean prime(int n) {
        // Write your code here
        int count=0;
        if(n==1){
            return false;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}