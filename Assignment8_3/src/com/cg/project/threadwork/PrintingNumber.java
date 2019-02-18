package com.cg.project.threadwork;

public class PrintingNumber implements Runnable{
	int f,n;
	public PrintingNumber(int i) {
		n=i;
	}
	public PrintingNumber() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("FirstThread"))
		{
			System.out.println(Math.random()*1000);
		}
//	if(t.getName().equals("SecondThread"))
//		{
			f=1;
				for(int i=1;i<=n;i++) {
					f=f*i;
							
				System.out.println(f);
//		}}
		
	}
	}
}
