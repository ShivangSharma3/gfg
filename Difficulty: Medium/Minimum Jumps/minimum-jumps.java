class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n=arr.length;
        
        int max=arr[0];
        int step=arr[0];
        int count=1;
        if(n==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        for(int i=1;i<n;i++){
            if(i==n-1){
                return count;
            }
            max=Math.max(max,i+arr[i]);
            step--;
            if(step==0){
             count++;
             if(i>=max){
                 return -1;
             }
             step=max-i;
            }
        }
        return -1;
    }
}