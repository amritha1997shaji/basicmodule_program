package average;

import java.util.Scanner;

public class Average {
	public static void main(String[] args)
	{
		int n,sum,average;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of students ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the mark of students:");
		
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		 sum=0;
		 average=0;
		for (int i = 0; i < n; i++) 
		{
			sum=sum+a[i];
		}
			average=sum/n;
		System.out.println("average"+average);
		
	}
	
}
