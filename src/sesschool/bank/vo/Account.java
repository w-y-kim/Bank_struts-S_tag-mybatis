package sesschool.bank.vo;

public class Account {
	String accountno;
	String custid;
	String accounttype; 
	int balance;
	int payment;
	double interest;
	String startdeposit;
	String enddeposit;
	String term;
	String approval;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public String getStartdeposit() {
		return startdeposit;
	}
	public void setStartdeposit(String startdeposit) {
		this.startdeposit = startdeposit;
	}
	public String getEnddeposit() {
		return enddeposit;
	}
	public void setEnddeposit(String enddeposit) {
		this.enddeposit = enddeposit;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", custid=" + custid + ", accounttype=" + accounttype + ", balance="
				+ balance + ", payment=" + payment + ", interest=" + interest + ", startdeposit=" + startdeposit
				+ ", enddeposit=" + enddeposit + ", term=" + term + ", approval=" + approval + "]";
	} 
	
}
