class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int max=-1;
        int smax=-1;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }
            if(smax<=arr[i] && max!=arr[i]){
                smax=arr[i];
            }
        }
        return smax;
    }
}