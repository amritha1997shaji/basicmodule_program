package retest;

import java.util.Scanner;

public class Retest {
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of students ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the mark of students:");
		int count=0;
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
		if(a[i]<=45)
			count++;
		}
		System.out.println("Number of students appearing for retest is"+count);
		
	}		
	}


