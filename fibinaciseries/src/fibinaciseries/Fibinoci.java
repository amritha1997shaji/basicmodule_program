package fibinaciseries;

import java.util.Scanner;

public class Fibinoci {
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no of students ");
		int n = s.nextInt();
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		int c;
		System.out.println("");
		for (int i = 0; i <= n; ++i) 
		{
			c=a+b;
			System.out.println(+c);
			c=a+b;
			a=b;
			b=c;

		
}
	}
}
