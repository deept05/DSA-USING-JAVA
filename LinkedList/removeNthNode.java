public class removeNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next == null){
            return null;
        } 

        // size
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }


        // removed nth node from end

        int indexToSearch = size - n;
        ListNode prev = head;
        int i =1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;

    }
}
