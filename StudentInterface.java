package org.java.programs;
import java.util.*;
class Student52{
  String name;
  int id;
  int age;
  String colour;
  Student52(String name,int id,int age,String colour){
    this.name=name;
    this.id=id;
    this.age=age;
    this.colour=colour;
  }
  public String toString()
    {
      return ("" + this.name + " " + this.id + " "+ this.age+" "+this.colour);
    }
}
class FirstComparator1 implements Comparator<Student52> {
     public int compare(Student52 e1, Student52 e2)
    {
        int val= (e2.name).compareTo(e1.name);
        if (val==0){
          if (e1.id > e2.id) {
            return 1;
          }
          else if (e1.id < e2.id) {
            return -1;
          }
          else {
            return 0;
          }
        }
      else
        return val;
    }
}
public class StudentInterface{
  public static void main(String[] args){

    TreeSet<Student52> ts=new TreeSet<>(new FirstComparator1());
    Student52 emp1=new Student52("Ravi",1,22,"red");
    Student52 emp2=new Student52("Ravi",2,23,"blue");
    Student52 emp3=new Student52("Pra",3,25,"green");
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println("Based on name the values printing in Ascending order");
    for (Student52 emp : ts) {

 

      System.out.println(emp);


    }
  }
}