import java.util.Scanner;


public class PersonMain
{

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	Person p1 = new Person();
	PersonMain p=new PersonMain();
	System.out.println("Enter your firstName:");
	String firstName=sc.nextLine();
	p1.setFirstName(firstName);
	System.out.println("Enter your lastName:");
	String lastName=sc.nextLine();
	p1.setLastName(lastName);
	try
	{
		if(firstName.length()==0 || lastName.length()==0)
		{
			throw new BlankSpaceException("Please fill the fields!");
		}
		else
		{
			System.out.println("Valid names!");
		}}
		catch( BlankSpaceException e)
		{
			e.printStackTrace();
		}
		System.out.println("Enter your gender:");
		Gender gender =Gender.valueOf(sc.next());
		p1.setGender(gender);
		System.out.println("Enter your phoneNumber:");
		String phoneNumber = sc.next();
		p1.setPhoneNumber(phoneNumber);
		p1.displayDetails();
	
	

	}


}