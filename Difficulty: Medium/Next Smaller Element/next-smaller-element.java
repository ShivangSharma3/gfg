class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int res=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<res){
                    list.add(arr[j]);
                    res=arr[j];
                    break;
                }
            }
            if(res==arr[i]){
                    list.add(-1);
            }
        }
        return list;
    }
}