// You are given two non-empty linked list
// representing two non-negative integers.
// The digits are stored in reverse order,
// and each of their nodes contains a single
// digit. Add the two numbers and return the
// sum as a linked list.


class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    ListNode lr = solution(l1, l2);
    while(lr != null) {
      System.out.print(lr.val + " ");
      lr = lr.next;
    }
  }


  private static ListNode solution(ListNode l1, ListNode l2) {
    ListNode resList = new ListNode(0);
    ListNode currentNode = resList;
    int carry = 0;

    while(l1 != null || l2 != null || carry != 0) {
      int x = (l1 == null) ? 0 : l1.val;
      int y = (l2 == null) ? 0 : l2.val;

      int sum = x + y + carry;
      carry = sum / 10;
      currentNode.next = new ListNode(sum % 10);
      currentNode = currentNode.next;

      if(l1 != null) l1 = l1.next;
      if(l2 != null) l2 = l2.next;
    }
    return resList.next;
  }
}
