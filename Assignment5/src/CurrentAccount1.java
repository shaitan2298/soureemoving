
public class CurrentAccount1 extends Account1 {
	double OverDraftLimit;
	public CurrentAccount1()
	{
		
	}

	public  CurrentAccount1(long accNum,double balance,Persons1 accHolder,double OverDraftLimit)
	{
		super(accNum,balance,accHolder);
		this.OverDraftLimit=OverDraftLimit;
	}
	
	public void withdraw(double withAmount) 
	{
		if(balance + OverDraftLimit < withAmount)
		{
			System.out.println("OverDraft Limit exceeded!");
		}
		else
		{
			balance = balance - withAmount;
			System.out.println("Show Updated Balance:"+balance);
		}
			}
	}


