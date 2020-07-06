package com.edu;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        int upgrade=0;
        ListNode curr1=l1;
        ListNode curr2=l2;
        ListNode curr3=l3;
        while( curr1!=null || curr2!=null || upgrade!=0){
            curr3.next=new ListNode();
            curr3=curr3.next;

            int result = (curr1==null?0:curr1.val) + (curr2==null?0:curr2.val);
            if(result+upgrade>=10)
            {
                curr3.val=(result+upgrade)%10;
                upgrade = 1;
            }
            else{
                curr3.val=(result+upgrade);
                upgrade = 0;
            }
            if(curr1!=null) curr1=curr1.next;
            if(curr2!=null) curr2=curr2.next;
        }
        return l3.next;
    }
}


 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }