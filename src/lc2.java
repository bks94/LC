public class lc2 {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current=null;
        ListNode first=null;
        int sum=0;
        while(true)
        {
            boolean empty=true;

            if (l1!=null) {
                sum += l1.val;
                l1=l1.next;
                empty=false;
            }
            if (l2!=null) {
                sum += l2.val;
                l2=l2.next;
                empty=false;
            }
            if (empty&&sum==0)
                break;

            if (current==null) {
            current=new ListNode();
            first=current;
            }else {
                current.next = new ListNode();
                current = current.next;
            }

            current.val=sum%10;
            sum-=sum%10;
            sum=sum/10;
        }

        return  first;
    }
}
 class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
