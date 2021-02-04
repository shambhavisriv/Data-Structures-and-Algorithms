package Linked List;

public class reverse {
    public static class Node<T>{
        int data;
        Node<T> next;
        Node(int data){
              this.data =  data;
              next =  null;
        }
        public static Node<Integer> reverserecursive(Node<Integer> head)
        {
            if(head == null || head.next == null){
                return head;
            }
            Node<Integer> rev = reverserecursive(.next);
            head.next.next  = head;
            head.next = null;
            return rev;
        }
    
}
