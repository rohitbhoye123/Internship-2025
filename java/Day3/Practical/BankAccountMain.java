package Demo1;

 class BankAccountMain {
	
	String accountNumber;
	String accountHolder;
	double balance;
	
	BankAccountMain(String accNo, String holder, double bal)
	{
		accountNumber=accNo;
		accountHolder=holder;
		balance=bal;
	}
	
	void deposite(double amount)
	{
		balance= balance + amount;
		System.out.println("Deposite:"+amount);
		
	}
 
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance= balance - amount;
			System.out.println("Withdraw:"+amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
    }
	
	void display()
	{
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder:"+accountHolder);
		System.out.println("Balance:"+balance);
	}

	public static void main(String[] args) {
		
		BankAccountMain acc=new BankAccountMain("123456","Rohit",1000);
		acc.display();
		acc.deposite(300);
		acc.withdraw(300);
		acc.display();
	}
}

		
	