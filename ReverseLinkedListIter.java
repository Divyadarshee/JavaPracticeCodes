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
  public ListNode reverseList(ListNode head) {
    if(head==null||head.next==null) return head;
    ListNode newhead = head;
    head.next = null;
    while(head.next!=null){
      ListNode f = head.next;
      newhead.next = head;
      head = newhead;
      newhead = f;
    }
    newhead.next = head;
    return newhead;
  }
}
                                              
