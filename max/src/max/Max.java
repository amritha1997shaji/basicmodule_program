package max;

import java.util.Scanner;

public class Max {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	if(n<0)
	{
		System.out.println("enter the number");
		n=s.nextInt();
	}
	int sum = 0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	}
}
