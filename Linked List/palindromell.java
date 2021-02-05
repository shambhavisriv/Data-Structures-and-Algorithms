import java.util.*;

public class palindromell
{
     public static class Node<T>{
            int data;
            Node<T> next;
            Node(int data){
                  this.data =  data;
                  next =  null;
    }
    private static Node<Integer> takeinput(){
        Scanner s =  new  Scanner(System.in);
        int data  = s.nextInt();
        Node<Integer> head  = null,tail =null;
        while(data != -1)
        {
              Node<Integer> curr  = new Node<Integer>(data);
              if(head  == null){
                    head  = curr;
                    tail =  curr;
              }
              else{
                    tail.next  = curr;
                    tail = curr;
              }
              data = s.nextInt();
        }
        return head;
  }
    private static Node<Integer> reverseI(Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;
        while( curr != null) {
            fwd = curr.next;
             curr.next = prev;
             prev = curr;
             curr = fwd;
       }
           return prev;
   }
   
       public static boolean isPalindrome(Node<Integer> head) {
            if (head == null || head.next == null) {
                return true;
           }
    
           Node<Integer> fast = head;
           Node<Integer> slow = head;
           while (fast.next != null && fast.next.next != null){
               fast = fast.next.next;
               slow = slow.next;
           }
            Node<Integer> sechead = slow.next;
                slow.next = null;
                sechead = reverseI(sechead);
           Node<Integer> a = sechead;	
           Node<Integer> b = head;
           while (a != null){
                if(a.data != b.data){
                   return false;
               }
            a = a.next;
            b = b.next;
       }
            return true;
       }
       
	public static void main (String[] args) throws java.lang.Exception
	{
		
	 Scanner s = new Scanner(System.in);
      Node<Integer> head = takeinput();
      boolean ans  = isPalindrome(head);
      System.out.print(ans);
	}
