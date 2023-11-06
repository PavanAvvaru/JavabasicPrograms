package org.java.programs;

import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
	 int marks=sc.nextInt();
	 if (marks>=94&&marks<=100)
	    {
	        System.out.println("A grade");
	    }
	     else if (marks>=90&&marks<94)
	    {
	        System.out.println("A- grade");
	    }
	    else if (marks>=87&&marks<90)
	    {
	        System.out.println("B+ grade");
	    }
	    else if (marks>=83&&marks<87)
	    {
	        System.out.println("B grade");
	    }
	    else if (marks>=80&&marks<=83)
	    {
	        System.out.println("B- grade");
	    }
	    else if (marks>=77&&marks<80)
	    {
	        System.out.println("C+ grade");
	    }
	    else if (marks>=73&&marks<77)
	    {
	        System.out.println("C grade");
	    }
	    else if (marks>=70&&marks<73)
	    {
	        System.out.println("C- grade");
	    }
	    else if (marks>=67&&marks<70)
	    {
	        System.out.println("D+ grade");
	    }
	    else if (marks>=63&&marks<67)
	    {
	        System.out.println("D grade");
	    }
	    else if (marks>=60&&marks<63)
	    {
	        System.out.println("D- grade");
	    }
	    else if (marks<60)
	    {
	        System.out.println("F grade");
	    }

	}

}
