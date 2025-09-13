class ListNode {
    int val;
    ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  //remember the while condition 
//   split the list into odd and even and then merge /

class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) return head;

        
        //taking two reference 
        ListNode odd = head; //for future ref
        ListNode evenHead = head.next; // for futher ref

        ListNode even = head.next;  
        
        
        while(even != null && even.next != null)
        {
            odd.next = even.next;
            odd = even.next;

            
            even.next = odd.next;
            even  = even.next;
            
        }
        odd.next = evenHead;

        return head;
    }
}