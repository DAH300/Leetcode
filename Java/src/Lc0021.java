public class Lc0021 {

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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if (list1 == null)
                return list2;
            if (list2 == null)
                return list1;

            ListNode list3 = new ListNode();
            ListNode curr = list3;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    curr.next = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list2;
                    list2 = list2.next;
                }
                curr = curr.next;
            }

            curr.next = (list1 != null) ? list1 : list2;

            return list3.next;
        }
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution sol = new Solution();

        ListNode list3 = sol.mergeTwoLists(list1, list2);

        while(list3 != null){
            System.out.println(list3.val);
            list3 = list3.next;
        }
    }

}
