public class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 != null) {
            return list2;
        } else if(list2 == null && list1 != null) {
            return list1;
        }
        ListNode head = new ListNode(0);
        ListNode current = head;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
            if(list1 == null) {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            } else if(list2 == null) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;    
            }
        }


        return head.next;
    }

    public static void printList(ListNode list) {
        if(list == null)  {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        do {
            System.out.print(list.val);
            list = list.next;
            if(list != null) {
                System.out.print(",");
            }
        } while(list != null);
        System.out.println("]");
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        
        printList(mergeTwoLists(list1, list2));
        printList(mergeTwoLists(null, new ListNode(0)));
        printList(mergeTwoLists(null, null));
    }
}
