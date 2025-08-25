/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        if(head==null){
            return arr;
        }
        Node temp=head;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        while(temp != null && last != null && temp.data < last.data){
            int sum=temp.data+last.data;
            if(sum==target){
                ArrayList<Integer> res=new ArrayList<>();
                res.add(temp.data);
                res.add(last.data);
                arr.add(res);
                temp=temp.next;
                last=last.prev;
            }
            if(sum>target){
                last=last.prev;
            }
            if(sum<target){
                temp=temp.next;
            }
        }
        return arr;
    }
}
