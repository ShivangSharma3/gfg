
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int n=arr.length;
        int m=indices.length;
        int arr1[]=new int[m];
        
        for(int i=0;i<m;i++){
            int num=indices[i];
            int index=arr[num];
            int count=0;
            for(int j=num+1;j<n;j++){
                if(index<arr[j]){
                    count++;
                }
            }
            arr1[i]=count;
        }
        return arr1;
    }
}
