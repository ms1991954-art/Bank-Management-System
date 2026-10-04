package bank;

public class BankAccount 
{
	
	String name = "Mahek";
	int accountNumber = 1001;
	double balance = 5000;
	String cardNumer="560608492102036";
	String customerId="CUST1001";
	String history="Account Created:₹5000\n";
	public String cardNumber;
	
	public BankAccount(String name,int accountNumber,double balance) {
		this.name = name;
		this.accountNumber= accountNumber; 
		this.balance = balance;
		this.history= "Account Created:₹" + balance + "\n";
	}
		public BankAccount() 
		{
			name="Mahek";
			accountNumber= 1001;
			balance= 5000;
			cardNumber= "560608492102036";
			customerId="CUST1001";
			history="Account Created:₹5000\n";
			
			
		}
	
		public void deposite(double amount) 
		
	{
		balance +=amount;
		history +="Deposite:₹" +amount + "\n";
	}
		public boolean withdraw(double amount)	
		{
			if(amount <=balance) 
			{
				balance -= amount;
				history +="Withdraw:₹ "+ amount + "\n";
				return true;
			}
			return false;
		}
		public double getBalance() 
		{
			return balance;
			
		}
		public String getHistory()	
		{
			return history;
		
		
		
	}	
} 
