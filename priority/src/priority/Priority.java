package priority;

import java.util.Scanner;

public class Priority {
	public static void main(String[] args)
	{
		
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of students ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the height of students:");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("height is in the order as");
		for (int i = 0; i < n ; i++) 
		{
			System.out.println(a[i]);
		}
	}   
}

