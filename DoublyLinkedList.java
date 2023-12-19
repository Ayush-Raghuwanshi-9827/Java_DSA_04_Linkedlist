public class DoublyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static class doublyLinkedList {
        int val;
        Node next;
        Node prev;
        doublyLinkedList(int val){
            this.val = val;
        }
        
    }
    public static Node insertAtTail(Node head , int x){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node  t = new Node(x);
        temp.next = t;
        t.prev = temp;
        return head;
    }
    public static Node inserAtInd(Node head, int ind, int x){
        Node temp = head;
        while (ind > 1) {
            temp = temp.next;
            ind--;
        }
        Node t = new Node(x);
        temp.next.prev = t;
        t.prev = temp;
        t.next = temp.next;
        temp.next = t;
        return head;
    }
    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        return t;
    }
    public static Boolean checkPalindrome(Node head){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node h = head;
        Node t = temp;
        while (h != t) {
            if (h.val != t.val) return false;
            h = h.next;
            t = t.prev;
        }
        return true;
    }
    public static Node deletatInd(Node head, int ind){
        Node temp = head;
        while (ind > 1) {
            temp = temp.next;
            ind--;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        return head;
    }

     public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
         public static void displayrev(Node tail){
            Node temp = tail;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
            return;
        }
        public static void display2(Node random){
            Node temp = random;
            while(temp.prev != null){
                temp = temp.prev;
            }
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        
        public static void twoSum(Node head, int target){
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node t = temp;
            Node h = head;
            while (h.val < t.val) {
                if (h.val + t.val == target) {
                    System.out.println("The two Nodes are "+ h.val+ " "+ t.val);
                    return;
                }else if (h.val + t.val > target) {
                    t = t.prev;
                    
                }else{
                    h = h.next;
                }
            }
            System.out.println("Target sum not found");
            return;
        }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6); 
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(15);
        a.next =  b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        // Node j = inserAtInd(a, 3, 787);
        // Node v = insertAtTail(a, 555);
        // display(j);
        // Node h = insertAtHead(a, 11);
        // Node m = deletatInd(a, 3);
        // display(m);
        // displayrev(f);
        // display2(c);
        twoSum(a, 14);                                                                                


    }
}
