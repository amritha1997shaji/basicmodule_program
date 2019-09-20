package casestudy2;

import java.util.Scanner;

public class Casestudy {
	public static void main(String[] args)
	{
		int booked[];
		System.out.println("Menu");
		System.out.println("1. Book");
		System.out.println("2. Check Status");
		System.out.println("3. Exit");
		System.out.println("enter your choise:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		
		case 1:
		
			System.out.println("Booking");
			System.out.println("Please choose the services required");
			book();
			break;
		case 2:
			System.out.println("check statues");
			System.out.println("enter your room:");
			//checkstatus();
			break;
		default:
			System.out.println("exist");
			break;
		}
	}

	
		static	void book()
		{
	int p=0;
			
				System.out.println("AC/non-AC(AC/nAC)");
				String ac;
				Scanner sc=new Scanner(System.in);
				ac=sc.nextLine();
				int l[]=new int[10];
				String a="ac";
				String b="nac";
				if(ac==a)
				{
					p=p+1000;
				}
				else 
				{
					p=p+500;
				}
				
				System.out.println("Cot(Single/Double)");
				String cot=sc.nextLine();
		        String c ="s";
		        String d ="d";
		        if(cot==c)
				{
					p=p+1000;
				}
				else 
				{
					p=p+500;
				}
				
		        System.out.println("With cable connection/without cable connection(C/nC)");
		        String cable=sc.nextLine();
		        String e="c";
		        String f="nc";
		        if(cable==e)
				{
					p=p+1000;
				}
				else 
				{
					p=p+500;
				}
				
				
		        System.out.println("Wi-Fi needed or not(W/nW");
		        String wifi=sc.nextLine();
				String g="w";
				String h="nw";
				if(wifi==g)
				{
					p=p+1000;
				}
				else 
				{
					p=p+500;
				}
				
				System.out.println("Laundry service needed / not)");
				String laundary=sc.nextLine();
				String i="l";
				String j="nl";
				if(laundary==i)
				{
					p=p+1000;
				}
				else 
				{
					p=p+500;
				}
				
			        
				//p=p1+p2+p3+p4+p5;
				System.out.println("The total charge is Rs"+p);
				System.out.println("The services chosen are");
				System.out.println(cot+"cot"+ac+"room");
				System.out.println("Do you want to proceed?(yes/no)");
				String ab=sc.nextLine();
			    String n="yes";
			    String m="no";
			    int k=1;
			    int v=0;
			    int flag=0;
		if((p>0)&&(ab==n))
			 
			for( k=1;k<35;k++)
			{
				l[k]=k+1;
				
			}
		//	l[k]=p;
			//v=k+1;
		//	 flag=1;
		//	break;
			
		//		if(flag==1)
		System.out.println("Thank you for booking. Your room number is"+l[k]);
		}

		}


