public class p19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // edge case where head is null
        if(head == null) {
            return head;
        }

        // loop to find list length
        int cnt = 1;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            cnt++;
        }

        int nodeCnt = cnt - n;
        // remove head if n and cnt match
        if(nodeCnt == 0) return head.next;
        //iterate till node to be deleted
        temp = head;
        while(nodeCnt-- > 1){
            temp = temp.next;
        }

        //skip the deleted node. essentially the node is being deleted
        temp.next = temp.next.next;

        return head;
    }




}



class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }