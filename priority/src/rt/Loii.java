package rt;
import java.util.Scanner;
public class Loii {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Registration");
	System.out.println("Enter your name:");
	String name=sc.nextLine();
	System.out.println("Enter your Address:");
	String add=sc.nextLine();
	System.out.println("Enter Email address:");
	String em=sc.nextLine();
	System.out.println("Contact number:");
	String con=sc.nextLine();
	System.out.println("Enter proof Type:");
	String id=sc.nextLine();
	System.out.println("Enter the ID number:");
	String num=sc.nextLine();
	 int a[]=new int[10];
	 int i;
	 int flag=0;
	 for(i=0;i<=40;i++)
	 {
	a[i]=0;
	a[i]=i+1;
	flag=1;
	   if(flag==1)
	   {
	System.out.println("Successfully registerd your id is:"+i);
	   
	System.out.println("Do you want to continue:(yes/no)");
	     String y=sc.nextLine();
	    while(y.equalsIgnoreCase("no"))
	      {
	    System.out.println("Do you want to edit email:(yes/no)");
	    String n=sc.nextLine();
	    if(n.equalsIgnoreCase("yes"))
	     {
	    System.out.println("Enter new email");
	    em=sc.nextLine();
	   
	    System.out.println("Email is updated");
	      }
	    else if(n.equalsIgnoreCase("no"))
	    {
	    System.out.println("Your details:");
	    System.out.println("Name :"+name);
	    System.out.println("Address :"+add);
	    System.out.println("Email :"+em);
	    System.out.println("Contact Number"+con);
	    System.out.println("Proof Type:"+id);
	    System.out.println("Proof ID"+num);
	   
	   
	   
	    }
	    else
	    {
	    System.out.println("Invalid");
	    }
	    }
	   
	    System.out.println("Your details:");
	    System.out.println("Name :"+name);
	    System.out.println("Address :"+add);
	    System.out.println("Email :"+em);
	    System.out.println("Contact Number"+con);
	    System.out.println("Proof Type:"+id);
	    System.out.println("Proof ID"+num);
	    }
	       


	}
	}
}
