public class Questions {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // Time complexcity O(n);
    public static Node ntNodeFromLast(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i=0; i< n; i++){
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static int size(Node head){
        int size = 0;
         Node temp = head;
         while (temp != null) {
            size++;
            temp = temp.next;
         }
         return size;
    }
    public static boolean hasCycle(Node head) {
        if(head == null) return false;
        if(head.next == null) return false;
        Node slow = head;
        Node fast = head;
        Boolean res = false;
        while(fast != null){
            if(slow.next == null){
                return false;
            }
            slow = slow.next;
            if(fast.next == null){
                return false;
            }
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return res;
        
    }
    public static Node finding_Intersection_of_Two_Linked_List(Node head1,Node head2){
       int sizeH1 = size(head1);
       int sizeH2 = size(head2);
       Node temp1 = head1;
       Node temp2 = head2;
       int steps = 0;
       if(sizeH1 > sizeH2){
         steps = sizeH1 - sizeH2;
        for(int i = 0; i < steps; i++){
            temp1 = temp1.next;
        }
       }else{
        steps = sizeH2 - sizeH1;
        for(int i = 0 ; i< steps; i++){
            temp2 = temp2.next;
        }
       }
       while (temp1 != temp2) {
        temp1 = temp1.next;
        temp2 = temp2.next;
       }
       return temp1;
    }
    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
              slow = head;
            
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
              }
              return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node i = new Node(33);
        Node f = new Node(90);
        Node g = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = i;
        i.next = f;
        // 2 -> 3 -> 4 -> 5 -> 6
        // System.out.println(hasCycle(a));
        // Node ans = finding_Intersection_of_Two_Linked_List(i, a);
        Node ans = detectCycle(a);
        System.out.println(ans);         
        
    }
}
