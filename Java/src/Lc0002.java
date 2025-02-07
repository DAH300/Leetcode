public class Lc0002 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int carry = 0;
            ListNode result = new ListNode();
            ListNode tail = result;
            while (l1 != null || l2 != null || carry != 0) {
                int curr = carry;
                carry = 0;

                if (l1 != null) {
                    curr += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    curr += l2.val;
                    l2 = l2.next;
                }

                carry = curr / 10;
                curr = curr % 10;

                tail.next = new ListNode(curr);
                tail = tail.next;
            }

            // while (result != null) {
            // System.out.println(result.val);
            // result = result.next;
            // }

            return result.next;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: l1 = [2,4,3], l2 = [5,6,4]
        // Output: [7,0,8]
        // Explanation: 342 + 465 = 807.

        // Example 2:
        // Input: l1 = [0], l2 = [0]
        // Output: [0]

        // Example 3:
        // Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        // Output: [8,9,9,9,0,0,0,1]

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l3 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l4 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode l5 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l6 = new ListNode(2, new ListNode(4, new ListNode(3)));


        // l8 designed to be larger than int
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        Solution sol = new Solution();

        sol.addTwoNumbers(l1, l2);

    }

}
