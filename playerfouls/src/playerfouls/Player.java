package playerfouls;

import java.util.Scanner;

public class Player {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no.of players");
	int n=s.nextInt();
	int a[]=new int[10];
	System.out.println("Enter the fouls");
	for (int i = 0; i < n; i++) 
	{
		a[i] = s.nextInt();
	}
	int count=0;
	for (int i = 0; i < n; i++)
	{
		if(a[i]<=39)
		{
			count++;
			
		}
	}
	System.out.println(count);
}
}
