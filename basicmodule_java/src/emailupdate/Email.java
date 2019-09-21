package emailupdate;
import java.util.Scanner;
public class Email {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your address");
		String address=sc.nextLine();
		System.out.println("Contact Number");
		int contact=sc.nextInt();
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
		
		System.out.println("Do you want to continue registration (y/n)?");
			}
		String m=sc.nextLine();
		String b="y";
		String c="n";
		if(m.equalsIgnoreCase("n"))
		{
			System.out.println("Do you want to update the email id?(yes/no)");
			String n=sc.nextLine();
			String x="yes";
			String y="no";
			if(x.equalsIgnoreCase("yes"))
			{
				System.out.println("Update Email:");
				System.out.println("Enter new Email id");
				 email=sc.nextLine();
			}
			else
			{
				System.out.println("Email updated");
				System.out.println("Your details are as follows");
				System.out.println("name:"+name);
				System.out.println("address:"+address);
				System.out.println("contact number:"+contact);
				System.out.println("email id:"+email);
				System.out.println("Proof type:"+id);
				System.out.println("Proof id:"+idno);
			}
			{
				System.out.println("Registration done");
				
			}
			
		}
		System.out.println("Email updated");
		System.out.println("Your details are as follows");
		System.out.println("name:"+name);
		System.out.println("address:"+address);
		System.out.println("contact number:"+contact);
		System.out.println("email id"+email);
		System.out.println("Proof type:"+id);
		System.out.println("Proof id:"+idno);
		}
			
	}
	

}
