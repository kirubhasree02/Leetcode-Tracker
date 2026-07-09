// Last updated: 09/07/2026, 15:13:26
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=head;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return res;
    }
}