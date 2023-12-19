
public class Remove_Nth_Node_From_Last {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static Node removeNode(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=0; i< n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        a.next = b;
        // 2 -> 3  4
        b.next = c;
        // 2 -> 3 -> 4
        c.next = d;
        // 2 -> 3 -> 4 -> 5
        d.next = e;
        // 2 -> 3 -> 4 -> 5 -> 6
        display(a);
        System.out.println();
        a = removeNode(a, 1);
        display(a);


    }
}
