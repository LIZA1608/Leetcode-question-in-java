/*https://leetcode.com/problems/insertion-sort-list/ */

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
     ListNode sorted=null;
    ListNode sortedInster(ListNode newnode){
        if(sorted ==null|| sorted.val>=newnode.val){
            newnode.next=sorted;
            sorted=newnode;
        }
        else{
            ListNode curr=sorted;
            while(curr.next!=null && curr.next.val<newnode.val){
                curr=curr.next;
            }
            newnode.next=curr.next;
            curr.next=newnode;
        }
        return sorted;
    }
    public ListNode insertionSortList(ListNode head) {
     ListNode ans=null;
        ListNode current=head;
        while(current!=null){
            ListNode After=current.next;
        ans=sortedInster(current);
            current=After;
        }
        return ans;
    }
}
