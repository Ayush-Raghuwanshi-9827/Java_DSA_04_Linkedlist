public class FindLengthOfLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static int lengthOfLinkedList(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null) {
            // System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(lengthOfLinkedList(a));
    }
}
