// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        // Code Here
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                if(temp.next!=null){
                    temp.next.prev=temp;
                }
            }
            else{
                 temp=temp.next;
            }
        }
        return head;
    }
}