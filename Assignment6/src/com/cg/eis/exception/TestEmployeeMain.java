package com.cg.eis.exception;
import java.util.Scanner;
public class TestEmployeeMain {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	EmployeeException p =new EmployeeException();
	System.out.println("Enter your name:");
	String name = sc.next();
	System.out.println("Enter your salary:");
	double salary = sc.nextDouble();
	try
	{
		if(salary<3000)
		{
			throw new EmployeeException();
		}}
	catch(EmployeeException e)
	{
		e.printStackTrace();
		System.out.println("Enter valid salary!");
	}
	System.out.println("Name:"+name+"Salary:"+salary);
	
	}

	}

