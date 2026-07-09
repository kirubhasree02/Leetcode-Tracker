// Last updated: 09/07/2026, 21:48:33
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode sortList(ListNode head) {
13        if(head==null || head.next==null) return head;
14        ListNode prev=null,slow=head,fast=head;
15        while(fast!=null && fast.next!=null){
16            prev=slow;
17            slow=slow.next;
18            fast=fast.next.next;
19        }
20        prev.next=null;
21        ListNode l1=sortList(head);
22        ListNode l2=sortList(slow);
23        return merge(l1,l2);
24    }
25    ListNode merge(ListNode l1,ListNode l2){
26        ListNode l=new ListNode(0),p=l;
27        while(l1!=null && l2!=null){
28            if(l1.val<l2.val){
29                p.next=l1;
30                l1=l1.next;
31            }else{
32                p.next=l2;l2=l2.next;
33            }
34            p=p.next;
35        }
36        if(l1!=null){
37            p.next=l1;
38        }
39        if(l2!=null){
40            p.next=l2;
41        }
42        return l.next;
43    }
44}