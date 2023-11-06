package org.java.programs;
import java.util.*;  
import java.util.Deque;
public class DequeSample
{  
  public static void main(String[] args) 
  {  
    Deque<Integer> deque = new ArrayDeque<Integer>(); 
    deque.add(1);  
    deque.add(2);  
    deque.add(3);  
    System.out.println("Inserting three elements : ");  
    System.out.println(deque);
    deque.addFirst(101);
    deque.addLast(301);
    System.out.println(deque); 
    deque.remove(2);  
    System.out.println("Removing the element 3 :"+deque);  
    System.out.println(deque.peekFirst());
    System.out.println(deque.peekLast());
    System.out.println(deque); 
    System.out.println(deque.pollFirst());
    System.out.println(deque); 
  }  
}