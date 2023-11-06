package org.java.programs;

import java.util.Scanner;

public class amazonFipkartUsingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("search for item ");
		String item=sc.next();
		switch(item)
		{
		    case "mobile":System.out.println("welcome to mobile section");
		                 break;
		    case "cloths":System.out.println("welcome to cloths section");
		                 break;
	       case "electronics":System.out.println("welcome to electronics section");
		                 break;
		    case "shoes":System.out.println("welcome to shoes section");
		                 break;
		    case "perfume":System.out.println("welcome to perfume section");
		                 break;
	       case "makeup kit":System.out.println("welcome to makeup kit section");
		                 break;
		  
		  case "dress":System.out.println("welcome to dress section");
		                 break;
	       case "shirt":System.out.println("welcome to shirts section");
		                 break;
		}
	}

}
