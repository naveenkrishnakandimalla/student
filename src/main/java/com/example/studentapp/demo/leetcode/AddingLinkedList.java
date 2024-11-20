package com.example.studentapp.demo.leetcode;

/*Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.*/

public class AddingLinkedList {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_Head = new ListNode(0);
        ListNode l3 = dummy_Head;
        int carry = 0;
        while(l1!= null || l2 != null){
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int num_val = l1_val + l2_val + carry;
            int new_digit = num_val % 10;
            carry = num_val/10;
            
            ListNode new_ListNode = new ListNode(new_digit);
            l3.next = new_ListNode;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            l3 = l3.next;
        }
        if(carry > 0) {
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }

        return dummy_Head.next;
    }
}


