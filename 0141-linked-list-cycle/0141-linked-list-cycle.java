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
        Set<ListNode> hash = new HashSet<>();
        while(head!=null){
            if(hash.contains(head)){
                return true;
            }
            hash.add(head);
            head = head.next;
        }
        return false;
    }
}