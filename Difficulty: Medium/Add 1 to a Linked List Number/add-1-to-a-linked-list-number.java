/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
        public static Node reverse(Node head){
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
        }
        public Node addOne(Node head) {
        // code here.
        head=reverse(head);
        Node temp=head;
        int carry=1;
                while(temp!=null){
                    int sum=temp.data+carry;
                    temp.data=sum%10;
                    carry=sum/10;
                    
                    if(carry==0) break;
                    
                    
        
        if(temp.next== null&& carry>0){
            temp.next=new Node(carry);
            carry=0;
            break;
        }temp=temp.next;
        
                
                }
        head=reverse(head);
        return head;
    }
}