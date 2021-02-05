import java.util.*;

public class appendlastntofirst
{
     public static class Node<T>{
            int data;
            Node<T> next;
            Node(int data){
                  this.data =  data;
                  next =  null;
            }
    public static Node<Integer> append(Node<Integer> head, int n)
    {
        if(n==0 || head == null )
        {
            return head;
        }
        Node<Integer> fast = head , slow = head , temp = head;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        while(fast.next != null)
        {
            slow = slow.next;
            fast =fast.next;
        }
        Node<Integer> newhead = slow.next;
        slow.next = null;
        fast.next = temp;
        head = newhead;
        return newhead;
    }
}        