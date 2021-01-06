
public class Account {
	private int accountId;
	private String accountHolderName;
	private Double accountBalance;
	
	//default cr
	public Account() {}
	
	//para ctr
	public Account(int accountId,String accountHolderName,Double accountBalance) {
		this.accountId=accountId;
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	
	//copy ctr
	public Account(Account account) {
		this.accountId=account.getAccountId();
		this.accountBalance=account.getAccountBalance();
		this.accountHolderName=account.getAccountHolderName();
	}

	//print 
	void printDetails() {
		System.out.println("Name:"+accountHolderName);
		System.out.println("Id:"+accountId);
		System.out.println("Balance:"+accountBalance);


	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}



	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
