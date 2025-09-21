class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        arr[front]=x;
        front++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
        // Your code here
        if(rear==front){
            return -1;
        }
        if(arr.length==0){
            return -1;
        }
        int el=arr[rear];
        rear++;
        return el;
    }
}