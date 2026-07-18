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
        if(head==null){
            return null;
        }
        List<Integer> values =new ArrayList<>();
        ListNode curr =head;
        while(curr!=null){
            values.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        int index=values.size()-1;
        while(curr!=null){
            curr.val=values.get(index);
            index--;
            curr=curr.next;
        }
        return head;
    }
}