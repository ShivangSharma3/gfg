class Solution {
    public int getSecondLargest(int[] arr) {

        // code here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                second=max;
                max=i;
            }else if(i>second && i!=max){
                second=i;
            }
        }
        return second;
    }
}