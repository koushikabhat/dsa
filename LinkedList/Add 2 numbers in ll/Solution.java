class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //result node 
        ListNode head = new ListNode(-1);
        ListNode mover = head;

        //carry variable
        int carry = 0;


        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while(curr1 != null || curr2 != null)
        {
            int val1 = (curr1 != null) ? curr1.val : 0;
            int val2 = (curr2 != null) ? curr2.val : 0;

            int result = val1 + val2 + carry;
            int res =  result % 10 ;
            carry = result/10;

            if(head.val == -1)
            {
                mover.val = res; 
            }
            else{
                ListNode temp = new ListNode(res);
                mover.next = temp;
                mover = temp;
            }
            
            //update curr pointer
            if (curr1 != null) curr1 = curr1.next;
            if (curr2 != null) curr2 = curr2.next;
        }

        if(carry > 0)
        {
            ListNode temp = new ListNode(carry);
            mover.next = temp;
            mover = temp;
        }

        return head;

    }
}