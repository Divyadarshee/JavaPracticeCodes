/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        // ListNode prelist = head;
        // ListNode postlist = head.next;
        while(head.next !=null){
            if(head.val != Integer.MAX_VALUE) head.val=Integer.MAX_VALUE;
            else return true;
            head = head.next;
        }
        // if(newlist.next!=null)
            
        return false;
    }
}
