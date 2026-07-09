// Last updated: 09/07/2026, 15:07:46
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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        while(head!=null){
            sum*=2;
            sum+=head.val;
            head=head.next;
        }
        return sum;
    }
}