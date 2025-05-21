package Day_3;
class fixedAmount{
	public int fixedamount = 10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}

public class Bank_prblm extends Withdrawal {
	fixedAmount f1 = new fixedAmount();
	void withdraw(int amount) {
		f1.fixedamount -= amount;
		System.out.println("withdrawn: "+ amount);
		System.out.println("Available Balance: "+ f1.fixedamount );
		
	}
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		Bank_prblm d = new Bank_prblm();
		d.withdraw(amount);
		
	}	
		
	}
	 
		
	

	