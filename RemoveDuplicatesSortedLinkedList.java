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
class RemoveDuplicatesSortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode newlist = head.next;
        ListNode prelist = head;
        
     while(prelist.next!=null) {
         if(prelist.val==newlist.val){
             prelist.next = newlist.next;
             newlist = newlist.next;
         }
         else prelist = prelist.next;
     }
        return head;
    }
}
