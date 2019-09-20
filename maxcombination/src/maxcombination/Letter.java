package maxcombination;

import java.util.Scanner;

public class Letter {
	public static void main(String[] args)
	{
		
		int fact=1;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of letters ");	
		n = s.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			fact=fact*i;
		}
		System.out.println("The number of combination is"+fact);
	}
}
