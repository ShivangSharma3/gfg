// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}