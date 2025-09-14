

// deleting a node from the end of the linked list 
//use Two pointer approach 
//fast moving n steps ahead of the curr pointer 
//edge cases : deleting head node and single node linked list
//            : if n is equal to the length of the linked list

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //taking two pointers 
        ListNode fast = head;
        ListNode curr = head;
        int count = 0;


        if(head.next == null && n == 1)
        {
            return null; 
        }

        //moving the fast pointer till n 
        while(count != n && fast.next != null)
        {
            fast = fast.next;
            count = count + 1;
        }

        //edge case to remove head
        if(count == n-1)
        {
            head = head.next;
            return head;
        }

        //move the second pointer 
        while(fast.next != null)
        {
            fast = fast.next;
            curr = curr.next;
        }

        //delete the curr.next
        curr.next = curr.next.next;

        return head;




    }
}