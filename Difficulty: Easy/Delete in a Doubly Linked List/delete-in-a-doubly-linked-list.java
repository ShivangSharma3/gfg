/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) return null;

        Node temp = head;
        int count = 1;

        // traverse to the x-th node
        while (temp != null && count < x) {
            temp = temp.next;
            count++;
        }

        // if node not found
        if (temp == null) return head;

        // if deleting head
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }

        // adjust links
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        return head;
    }
}
