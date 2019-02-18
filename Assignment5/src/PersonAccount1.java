import java.util.Scanner;
public class PersonAccount1 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	Persons1 smith = new Persons1();
	Persons1 kathy = new Persons1();
	Account1 smithAcc = new CurrentAccount1();
	Account1 kathyAcc = new CurrentAccount1();
	
	long accNum1=(long)(Math.random()*10000);
	smithAcc.setAccNum(accNum1);
	smith.setName("smith");
	smith.setAge(21);
	smithAcc.setBalance(2000);
	smithAcc.setaccHolder(smith);
	System.out.println(smithAcc.toString());
	System.out.println("The updated balance of Smith's Account is:");
	smithAcc.depositAmount(2000);
	System.out.println(smithAcc.toString());
	double balnce =smithAcc.getBalance();
	System.out.println(balnce);
	Account1 savingsAcc = new SavingsAccount1(accNum1,balnce,smith);
	System.out.println("Enter withdrawal amount:");
	double withAmount = sc.nextDouble();
	savingsAcc.withdraw(withAmount);
	System.out.println("Enter the overDraft limit:");
	double OverDraftLimit1 =sc.nextDouble();
	Account1 currAcc = new CurrentAccount1(accNum1,balnce,smith,OverDraftLimit1);
	currAcc.withdraw(OverDraftLimit1);
	System.out.println("********************");
	
	long accNum2=(long)(Math.random()*10000);
	kathyAcc.setAccNum(accNum2);
	kathy.setName("kathy");
	kathy.setAge(28);
	kathyAcc.setBalance(3000);
	kathyAcc.setaccHolder(kathy);
	System.out.println(kathyAcc.toString());
	System.out.println("The updated balance of Kathy's Account is:");
	kathyAcc.withdraw(1000);
	System.out.println(kathyAcc.toString());
	double bal =kathyAcc.getBalance();
	System.out.println(bal);
	Account1 savingsAcc1 = new SavingsAccount1(accNum1,balnce,kathy);
	System.out.println("Enter withdrawal amount:");
	double withAmounts = sc.nextDouble();
	savingsAcc1.withdraw(withAmounts);
	System.out.println("Enter the overDraft limit:");
	double OverDraftLimit2 =sc.nextDouble();
	Account1 currAccs = new CurrentAccount1(accNum2,balnce,kathy,OverDraftLimit2);
	currAccs.withdraw(OverDraftLimit2);
	
	}
	}