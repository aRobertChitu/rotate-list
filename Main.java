import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class Main {



    
    
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return null;
        }

        ListNode rotationStartNode = head;
        ListNode firstNode = head;
        int numberOfNodes = 0;

        for(int i = 0; i < k ; i++){
            if(head.next !=null) {
                head = head.next;
                numberOfNodes ++;
            }else{
                head = firstNode;
                numberOfNodes ++;
                k = k % numberOfNodes + numberOfNodes;
            }

        }
        while( head != null && head.next!=null){
            head = head.next;
            rotationStartNode = rotationStartNode.next;
        }
        head.next =  firstNode;
        firstNode = rotationStartNode.next;
        rotationStartNode.next = null;

        return firstNode;

    }


}