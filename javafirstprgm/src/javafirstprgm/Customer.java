package javafirstprgm;

public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public Customer(String name, String address, String contactNumber, String email, String proofType, String proofID) {
		
			this.name=name;
			this.address=address;
			this.contactNumber=contactNumber;
			this.email=email;
			this.proofType=proofType;
			this.proofID=proofID;
			 
	}

	void register(String name,String address,String contactNumber,String email,String proofType,String proofID)
	{
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contactNumber);
		System.out.println(this.proofType);
		System.out.println(this.proofID);
	}

}
