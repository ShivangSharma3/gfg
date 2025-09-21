class MyStack {
    int top=-1;
    int st[]=new int[100000];

    
    public void push(int x) {
        // code here
       top++;
       st[top]=x;
    }

    public int pop() {
        
        // code here
        if(top==-1){
            return -1;
        }
        int el=st[top];
        top--;
        return el;
    }
}
