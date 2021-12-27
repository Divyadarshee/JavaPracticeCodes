/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode oddnode = head;
        ListNode evehead = head.next;
        ListNode evenode = head.next;
        int pos = 0;
        while(evenode.next!=null){
            oddnode.next = evenode.next;
            oddnode = evenode;
            evenode = evenode.next;
            oddnode.next = null;
            pos++;
        }
        System.out.println(evehead.val);
        if(pos%2!=0){evenode.next = evehead;}
        else oddnode.next = evehead;
        return head;
    }
}
