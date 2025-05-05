/*234. Palindrome Linked List */

/*Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
  */

  class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow != null)
        {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while(secondHalf != null)
        {
            if(firstHalf.val != secondHalf.val)
            {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}