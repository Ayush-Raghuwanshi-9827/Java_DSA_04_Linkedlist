public class Basic {
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
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
        

    }
}
