package leapyr;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter year ");
		int n = s.nextInt();
		if((n%4==0)&&(n%400==0)) {
			System.out.print("leap year");
		}
		else if(n%100==0)
		{
			System.out.print("not leap year");
		}
		else
		{
			System.out.print("not leap year");
			
	}
}
}
