package org.java.programs;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
	 int marks=sc.nextInt();
	    if (marks>=90&&marks<=100)
	    {
	        System.out.println("A grade");
	    }
	     else if (marks>=80&&marks<=89)
	    {
	        System.out.println("B grade");
	    }
	    else if (marks>=70&&marks<=79)
	    {
	        System.out.println("C grade");
	    }
	    else if (marks>=50&&marks<=69)
	    {
	        System.out.println("D grade");
	    }
	    else if (marks>=0&&marks<=49)
	    {
	        System.out.println("E grade");
	    }
	}

}
