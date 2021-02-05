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
