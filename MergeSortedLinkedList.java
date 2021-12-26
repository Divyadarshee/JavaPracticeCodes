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
class MergeSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode();
        ListNode newnode = newlist;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                newnode.next = list1;
                newnode = newnode.next;
                list1 = list1.next;
            }
            else {
                newnode.next = list2;
                newnode = newnode.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            newnode.next = list1;
            newnode = newnode.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            newnode.next = list2;
            newnode = newnode.next;
            list2 = list2.next;
        }
        return newlist.next;// On initializing the linkedlist node it creates a non-null node with 0 as the value
    }
}
