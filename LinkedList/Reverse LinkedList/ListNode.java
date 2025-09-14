/*
  Take three pointer and reverse from starting and move ahead 
  make sure u make head.next  = null 
  or it will become a cyclic
  
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = head;
        ListNode curr = head;
        ListNode last = null;

        if(head == null || head.next == null)
        {
            return head;
        }
        curr = head.next;

        if(curr.next == null)
        {
            curr.next = prev;
            prev.next = null;
            return curr;
        }

        last = curr.next;

        head.next = null;
        while(last != null)
        {
            curr.next = prev;
            // prev.next = ;
            prev = curr;
            curr = last;
            last = last.next;
        }

        curr.next = prev;
        return curr;


       
    }
}