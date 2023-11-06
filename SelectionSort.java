package org.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort 
{
	    public static void main(String[] args)
	    {  
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter how many elements you want to give");
	    	int size=sc.nextInt();
	        int[] arr1=new int[size];
	        System.out.print("enter elements");
	        for(int i=0;i<size;i++) 
	        {
				arr1[i]=sc.nextInt();
			}
	        System.out.println("Before Selection Sort : "+Arrays.toString(arr1));
	        
	        for(int i=0;i<arr1.length-1;i++)
	        {  
	            int index=i;  
	            for (int j=i+1;j<arr1.length;j++)
	            {  
	                if(arr1[j]<arr1[index])
	                {  
	                    index=j; 
	                }  
	            }  
	            int smallerNumber=arr1[index];   
	            arr1[index]=arr1[i];  
	            arr1[i]=smallerNumber;  
	        }
	        System.out.println("After Selection Sort");  
	        System.out.println(Arrays.toString(arr1));
	    }  
}
