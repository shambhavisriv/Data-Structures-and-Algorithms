
import java.util.*;

class deletenode
{
     public static class Node<T>{
            int data;
            Node<T> next;
            Node(int data){
                  this.data =  data;
                  next =  null;
            }
            public static Node<Integer> deleterecursive (Node<Integer> head, int pos)
            {
                if(head == null){
                    return null;
                }
                Node<Integer> temp = head;
                if(pos==0){
                    temp=head.next;
                    return temp;
                }  
                else{
                    temp.next =  deleterecursive(head.next,pos-1);
                }
            }
      }