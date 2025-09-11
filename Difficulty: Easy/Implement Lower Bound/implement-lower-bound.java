class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int left=0;
        int right=n-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=target){
                    n=mid;
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }
        return n;
    }
}
