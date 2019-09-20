package javafirstprgm;
import java.util.Scanner;

 class Sample{
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static int regID=0;
public Sample(String name,String address,String contactNumber,String email,String proofType,String proofID)
{
this.name=name;
this.address=address;
this.contactNumber=contactNumber;
this.email=email;
this.proofType=proofType;
this.proofID=proofID;
 }
	public static void main(String[] args) {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
	//	BufferReader br=new BufferReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		address=sc.nextLine();
		contactNumber=sc.nextLine();
		 email=sc.nextLine();
		proofType=sc.nextLine();
		 proofID=sc.nextLine();
		Customer custmer=new Customer(name,address,contactNumber,email,proofType,proofID);
		 custmer.register(name,address,contactNumber,email,proofType,proofID);
		 sc.close();
	}

}

