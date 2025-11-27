class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int pos=0;
        for(int num:arr){
            if(num!=0){
                arr[pos++]=num;
            }
        }
        while(pos<arr.length){
            arr[pos++]=0;
        }
    }
}