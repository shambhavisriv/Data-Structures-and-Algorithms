
import java.util.*;

class main
{
     public static class Node<T>{
            int data;
            Node<T> next;
            Node(int data){
                  this.data =  data;
                  next =  null;
            }
            
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
      private static void print(Node<Integer> head){
            Node<Integer> temp = head;
            while(temp != null){
                  System.out.print(temp.data+" ");
                  temp= temp.next;
            }
            System.out.println();
      }
	public static void main (String[] args) throws java.lang.Exception
	{
		
	Scanner s = new Scanner(System.in);
      Node<Integer> head = takeinput();
      print(head);
	}
      
}