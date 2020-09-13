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
    //O(n) solution
    int result = 0;
    while(head != null){
        result = result*2 + head.val;
        head = head.next;
    }
    return result;
        
    /* Less efficient and uses more memory
    String binaryString = "";
    ListNode current = head;
    while(current != null){
        binaryString += current.val;
        current = current.next;
    }
    return Integer.parseInt(binaryString, 2);
    }*/
    }
}
