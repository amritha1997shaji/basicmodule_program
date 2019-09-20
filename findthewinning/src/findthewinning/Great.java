package findthewinning;

import java.util.Scanner;

public class Great {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of applications");
		int n = s.nextInt();
		int a[] = new int[10];
		System.out.println("Enter the amount(in crores)");
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		int greater=a[0];
		for (int i = 0; i < n; i++) 
		{
			if(greater<a[i+1])
			{
				greater=a[i+1];
			}
		}
		System.out.println(greater);
}
}