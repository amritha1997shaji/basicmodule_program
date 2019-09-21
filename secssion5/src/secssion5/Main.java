package secssion5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your address");
		String address=sc.nextLine();
		System.out.println("Contact Number");
		String contact=sc.nextLine();
		System.out.println("E-Mail ID");
		String email=sc.nextLine();
		System.out.println("Enter proof type");	
		String id=sc.nextLine();
		System.out.println("Enter proof ID");	
		String idno=sc.nextLine();
		int a[]=new int[10];	
		int i=0;
		int flag=0;
		for(i=0;i <= 10;i++)
		{
			a[i]=0;
			a[i]=i+1;
			flag=1;
			if(flag==1)
			{
			System.out.println("Thank you for registering. Your id is"+a[i]);
			}
		System.out.println("Do you want to continue registration (y/n)?");
		String m=sc.nextLine();
		String b="y";
		String c="n";
		int  n=100;
		if(m.equalsIgnoreCase("y"))
		{
			System.out.println("Registration");
			System.out.println("Enter your name");
			name=sc.nextLine();
			System.out.println("Enter your address");
			address=sc.nextLine();
			System.out.println("Contact Number");
			contact=sc.nextLine();
			System.out.println("E-Mail ID");
			email=sc.nextLine();
			System.out.println("Enter proof type");	
			id=sc.nextLine();
			System.out.println("Enter proof ID");	
			idno=sc.nextLine();
			
		}
		else if (m.equalsIgnoreCase("n"))
		{
			System.out.println("Customers list");
			System.out.println("The registered customers are");
			System.out.println("Customer ID  Customer name");
			for(int s=0;s<i;s++)
			{
				System.out.println(+a[s]+"                "+name);
			}
			System.out.println("Thanku");
			
		}
		
		
}
	}
}
	