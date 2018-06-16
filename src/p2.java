//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.ListIterator;
//
//public class p2 {
//
////    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
////
////    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
////
////            Example
////
////    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
////    Output: 7 -> 0 -> 8
////    Explanation: 342 + 465 = 807.
//
//    public static void main(String[] args) {
//
//    }
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode ans;
//        int carry = 0;
//        ans = new ListNode(0);
//        ListNode reference = ans;
//
//        while (l1.next !=null || l2.next != null) {
//
//            int x = l1 == null ? 0 : l1.val;
//            int y = l2 == null ? 0 : l2.val;
//
//            if(x + y > 9) {
//                ans.val = ((x + y)% 10) + carry;
//                carry = 1;
//                ans.next = new ListNode(0);
//                ans = ans.next;
//            } else {
//                ans.val = (x + y) + carry;
//                carry = 0;
//                ans.next = new ListNode(0);
//                ans = ans.next;
//            }
//
//            if(l1 != null) l1 = l1.next;
//            if(l2 != null) l2 = l2.next;
//        }
//
//
//        String a = "Hello world";
//        String[] blah = a.split(" ");
//        blah.length
//
//        return reference;
//    }
//
//
//    public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
//
//}
