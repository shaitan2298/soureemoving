
public class InterprocessThread implements Runnable{

	@Override
	public synchronized void run(){
		Thread t = Thread.currentThread();
		if(t.getName().equals("Customer")){
			try { 
				System.out.println("Customer giving products to billing person");
				notify();
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(t.getName().equals("BillingPerson"))
		{
			try { 
				notify();
				wait();
				System.out.println("Billing person bills the product");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	} 

}