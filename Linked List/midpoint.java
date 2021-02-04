public class midpoint {
    public static class Node<T>{
        int data;
        Node<T> next;
        Node(int data){
              this.data =  data;
              next =  null;
        }

        public static Node<Integer> mid(Node<Integer> head)
        {
            if(head==null || head.next == null)
            {
                return head;
            }
            Node<Integer> slow =  head;
            Node<Integer> fast = head.next;
            while(fast!=null && fast.next!=null)
            {
                slow = slow.next;
                fast.next.next;
            }
            return slow;

            
        }
    
}
