class Solution {
    int missingNum(int arr[]) {
        // code here
         Arrays.sort(arr);
        int k=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                k++;
            }
            else if(arr[i]>k){
               return k;
            }
        }
        return k;
    }
}