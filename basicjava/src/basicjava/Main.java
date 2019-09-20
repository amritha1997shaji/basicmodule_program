package basicjava;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		String name;
		String age;
		String degree;
		String branch;
		String contact;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		age=sc.nextLine();
		degree=sc.nextLine();
		branch=sc.nextLine();
		contact=sc.nextLine();
		sc.close();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("degree:"+degree);
		System.out.println("branch:"+branch);
		System.out.println("contact:"+contact);
}
}
