enum Gender
{
	Undefined,M,F
	}
public class Person 
{
private String firstName;
private String lastName;
private Gender gender;
private String phoneNumber;
	Person()
	{
		System.out.println("Person Details:\n");
		System.out.println("-----------\n");
	}
	Person(String f,String l,Gender g,String p)
	{
		firstName =f;
		lastName=l;
		gender =g;
		phoneNumber=p;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fs) {
		this.firstName = fs;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String ls) {
		this.lastName = ls;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender g) {
		this.gender = g;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String p) {
		this.phoneNumber = p;
	}
	public void displayDetails()
	{
		System.out.println("First Name:"+firstName+"\n"+"Last Name:"+lastName+"\n"+"Gender:"+gender+"\n"+"Phone Number:"+phoneNumber);
	}

}
