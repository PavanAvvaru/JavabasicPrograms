package org.java.programs;
import java.util.Scanner;
public class fbLogIn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String name=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		if (name.equals("nani")&& pass.equals(pass)) {
			System.out.println("welcome to facebook");	
		}
		else
		{
			System.out.println("enter valid user name or password");
		}
	}
	
}
