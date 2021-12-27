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
        ListNode slownode = head;
        ListNode fastnode = head;
        while(fastnode.next !=null && fastnode.next.next !=null){
            fastnode = fastnode.next.next;
            slownode = slownode.next;
            if(fastnode == slownode) return true;
        }
        return false;
    }
}
