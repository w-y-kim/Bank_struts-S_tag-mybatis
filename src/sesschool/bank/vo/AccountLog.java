package sesschool.bank.vo;

public class AccountLog {
	
	int logid; 
	String custid;
	String accountno;
	String transferno;
	String evendate;//date 
	String eventype;
	String eventrecord;
	int amount;
	int balance;
	
	
	
	public AccountLog(int logid, String custid, String accountno, String transferno, String evendate, String eventype,
			String eventrecord, int amount, int balance) {
		super();
		this.logid = logid;
		this.custid = custid;
		this.accountno = accountno;
		this.transferno = transferno;
		this.evendate = evendate;
		this.eventype = eventype;
		this.eventrecord = eventrecord;
		this.amount = amount;
		this.balance = balance;
	}
	public int getLogid() {
		return logid;
	}
	public void setLogid(int logid) {
		this.logid = logid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getTransferno() {
		return transferno;
	}
	public void setTransferno(String transferno) {
		this.transferno = transferno;
	}
	public String getEvendate() {
		return evendate;
	}
	public void setEvendate(String evendate) {
		this.evendate = evendate;
	}
	public String getEventype() {
		return eventype;
	}
	public void setEventype(String eventype) {
		this.eventype = eventype;
	}
	public String getEventrecord() {
		return eventrecord;
	}
	public void setEventrecord(String eventrecord) {
		this.eventrecord = eventrecord;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "ACCOUNTLOG [logid=" + logid + ", custid=" + custid + ", accountno=" + accountno + ", transferno="
				+ transferno + ", evendate=" + evendate + ", eventype=" + eventype + ", eventrecord=" + eventrecord
				+ ", amount=" + amount + ", balance=" + balance + "]";
	} 
	
	
	
	

}
