/*
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}
*/

class MyQueue {
    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int a) {
        // code here
        QueueNode temp=new QueueNode(a);
        if(rear==null){
            front=rear=temp;
        }else{
            front.next=temp;
            front=temp;
        }
    }

    // Function to pop front element from the queue
    int pop() {
        // code here
        if(rear==null){
            return -1;
        }
        int el=rear.data;
        rear=rear.next;
        return el;
    }
}