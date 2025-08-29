class MyStack {
    int top=-1;
    int oper[];
    
    MyStack(){
        oper=new int[1000];
    }
    
    public void push(int x) {
        // code here
        if(top==oper.length-1){
            return;
        }
        top=top+1;
        oper[top]=x;
    }

    public int pop() {
        
        // code here
        if(top==-1){
            return -1;
        }
        int val=oper[top];
        top=top-1;
        return val;
    }
}
