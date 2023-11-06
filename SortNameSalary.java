package org.java.programs;
import java.util.*;
class Employee
{
    String name;
    double salary;
    Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public String toString()
    {
        return "name : "+name+"  and salary : "+salary;
    }
}
class SortByName implements Comparator<Employee>
{
    public int compare(Employee o1, Employee o2) 
    {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }
}
class SortByMarks implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        return (int) (o1.salary-o2.salary);
    }    
}
public class SortNameSalary
{
    public static void main(String[] args) 
    {
        PriorityQueue<Employee> e=new PriorityQueue<Employee>(new SortByName());
        e.add(new Employee("man",5000));
        e.add(new Employee("nan",2500));
        e.add(new Employee("ban",2450));
        double max=0;
        for(Employee r:e)
        {
        	if(r.salary>max)
        	{
        		max=r.salary;
        	}
        }
        
        for(Employee r:e)
        {
        	System.out.println(" minimum salary "+r);
        	break;
        }
        for(Employee r:e)
        {
        	if(r.salary==max)
        	{
                System.out.println(" maximum salary "+r);
        	}
        	if(r.salary>=2000&&r.salary<=4000)
        	{
        		System.out.println(r);
        	}
        }   
    }
}