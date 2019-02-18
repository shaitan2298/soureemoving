package com.cg.project.client;

import com.cg.project.threadwork.PrintingNumber;

public class MainClass {
	public static void main(String[] args) throws InterruptedException {
		PrintingNumber resource=new PrintingNumber();
		
		Thread th1=new Thread(resource,"FirstThread");
		
		Thread th21 = new Thread(new PrintingNumber(5));
		th1.start();
		//th1.join();
		th21.start();
		System.out.println("Main Thread End Here");
		
	}

}