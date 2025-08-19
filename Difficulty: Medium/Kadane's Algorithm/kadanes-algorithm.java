class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
         int max=arr[0];
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i],arr[i]+curr);
            max=Math.max(max,curr);
        }
        return max;
    }
}
