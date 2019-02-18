import java.util.Scanner;
public class TestPerson1Main {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	Person1 p =new Person1();
	System.out.println("Enter your name:");
	String name = sc.next();
	System.out.println("Enter your age:");
	int age = sc.nextInt();
	try
	{
		if(age<15)
		{
			throw new ValidateAgeException();
		}}
	catch(ValidateAgeException e)
	{
		e.printStackTrace();
		System.out.println("Enter valid age!");
	}
	System.out.println("Name:"+name+"Age:"+age);
	
	}

	}


