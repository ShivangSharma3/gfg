// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        int n=s.length();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        for(char ch:set){
            res.append(ch);
        }
        return res.toString();
    }
}
