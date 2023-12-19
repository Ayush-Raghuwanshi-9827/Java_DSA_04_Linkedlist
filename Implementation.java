
public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx > 0 || idx > size) {
                System.out.println("Wrong input");
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                // System.out.println(temp.data);
                temp = temp.next;
                count++;
            }
            return count;
        }
        void deletAt(int idx){
            Node temp = head;
            for(int i=0; i < idx -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        int getAt(int idx) {
            if (idx > 0 || idx > size()) {
                System.out.println("Wrong input");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtHead(77);
        ll.insertAt(0, 55);
        ll.display();
        ll.deletAt(2);
        ll.display();
        // System.out.println(ll.getAt(8));
        System.out.println(ll.size);

    }
}
