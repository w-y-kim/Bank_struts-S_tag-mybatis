package sesschool.bank.vo;

public class AccountLog {

	int logid;
	String custid;
	String accountno;
	String transferno;
	String eventdate;// date
	String eventtype;
	String eventrecord;
	int amount;
	int balance;

	public AccountLog() {
		// TODO Auto-generated constructor stub
	}
	
	

	public AccountLog(int logid, String custid, String accountno, String transferno, String eventdate, String eventtype,
			String eventrecord, int amount, int balance) {
		super();
		this.logid = logid;
		this.custid = custid;
		this.accountno = accountno;
		this.transferno = transferno;
		this.eventdate = eventdate;
		this.eventtype = eventtype;
		this.eventrecord = eventrecord;
		this.amount = amount;
		this.balance = balance;
	}



	public String getEventtype() {
		return eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
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

	public String getEventdate() {
		return eventdate;
	}

	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
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
				+ transferno + ", eventdate=" + eventdate + ", eventtype=" + eventtype + ", eventrecord=" + eventrecord
				+ ", amount=" + amount + ", balance=" + balance + "]";
	}

}
