class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int hcf=gcd(a,b);
        int lcm=(a*b)/hcf;
        return new int[]{lcm,hcf};
        
    }
        public static int gcd(int x,int y){
           while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x; 
        }
}