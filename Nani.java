package org.java.programs;
import java.util.*;
public class Nani {
    public static void main(String[] args)
    {
        LinkedHashSet<String> a=new LinkedHashSet<String>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("A");
        a.add("E");
        System.out.println("Size of LinkedHashSet        : "+ a.size());
        System.out.println("Original LinkedHashSet       : "+a);
        System.out.println("Removing D from LinkedHashSet: "+a.remove("D"));
        System.out.println("Trying to Remove Z which is not "+ "present: "+a.remove("Z"));
        System.out.println("Checking if A is present      : "+a.contains("A"));
        System.out.println("Updated LinkedHashSet         : "+a);
    }
}
