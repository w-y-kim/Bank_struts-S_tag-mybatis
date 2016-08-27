package sesschool.bank.vo;

public class Account {
   String accountno; 
   String custid; 
   String accounttype;
   int balance; 
   int payment; 
   double interest; //이율(예금계좌는 해당없음) 
   String startdeposit; //날짜 
   String enddeposit; //날짜 
   String term;
   String approval;
   
   public Account() {
	// TODO Auto-generated constructor stub
}
   
   public Account(String accountno, String custid, String accounttype, int balance, int payment, int interest,
         String startdeposit, String enddeposit, String approval) {
      super();
      this.accountno = accountno;
      this.custid = custid;
      this.accounttype = accounttype;
      this.balance = balance;
      this.payment = payment;
      this.interest = interest;
      this.startdeposit = startdeposit;
      this.enddeposit = enddeposit;
      this.approval = approval;
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



   public void setInterest(int interest) {
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



   public String getApproval() {
      return approval;
   }



   public void setApproval(String approval) {
      this.approval = approval;
   }

   
   


   public String getTerm() {
      return term;
   }



   public void setTerm(String term) {
      this.term = term;
   }



   @Override
   public String toString() {
      return "Account [accountno=" + accountno + ", custid=" + custid + ", accounttype=" + accounttype + ", balance="
            + balance + ", payment=" + payment + ", interest=" + interest + ", startdeposit=" + startdeposit
            + ", enddeposit=" + enddeposit + ", approval=" + approval + "]";
   } 
   
}