import java.util.*;


public class reverseIterative {


    if(head == null || head.next == null){
        return;
    }

    Node prevNode = head;
    Node currNode = head.next;

    While(currNode != null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;

    }

    head.next = null;
    head = prevNode;
    
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
 
 

    }
}
