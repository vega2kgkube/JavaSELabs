package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	
	public String getAcctId() {
		return acctId;
	}
		
}
