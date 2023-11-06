package org.java.programs;

import java.util.Scanner;

public class DivisibleBy2Nd3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if (num%2==0 && num%3==0) {
			System.out.println("the given number "+num+" divisible by 2 and 3");
			
		}
		else
		{
			System.err.println("the given number \"+num+\" not divisible by 2 and 3");
		}
	}
	

}
