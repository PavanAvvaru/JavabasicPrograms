package org.java.programs;

import java.util.*;

public class SampleCalciUseSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number ");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.err.println("enter a operation");
		System.err.println("enter '+' for addition");
		System.err.println("enter '-' for substraction");
		System.err.println("enter '*' for multiplication");
		System.err.println("enter '/' for coefficient");
		System.err.println("enter '%' for remainder");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':System.out.println("selected addition operation");
		         System.out.println(" addition of a and b is "+(a+b));
		         break;
		case '-':System.out.println("selected substraction operation");
        System.out.println(" substraction of a and b is "+(a-b));
        break;
		case '*':System.out.println("selected multiplication operation");
        System.out.println(" multiplication of a and b is "+(a*b));
        break;
		case '/':System.out.println("selected to find cofficient operation");
        System.out.println(" division of a and b is "+(a/b));
        break;
		case '%':System.out.println("selected module to fing remainder operation");
        System.out.println(" remainder of a and b is "+(a%b));
        break;
		}
	}

}
