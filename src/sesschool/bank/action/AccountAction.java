package sesschool.bank.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sesschool.bank.dao.AccountDAO;
import sesschool.bank.vo.Account;
import sesschool.bank.util.AccountIDManager;

public class AccountAction extends ActionSupport implements SessionAware{

	private Account account;//FIXME 가입과 다르게 아이디 체크가 없어서 생성필요함 
	private String accountno; 	
	private Map<String, Object> session;

	AccountDAO dao = new AccountDAO();

	public String execute() {
		System.out.println("AccountAction.excute()");
		setAccountno(AccountIDManager.newAccountNo());//계좌생성해 초기값으로 넣어줌
		//custid는 세션값을 전송시에 넣어서 보냄
		return SUCCESS;
	}

	public String haveAccount(){
		System.out.println("AccountAction.haveAccount()");
		return SUCCESS; 
	}
	public String account1(){
		System.out.println("AccountAction.account1()");
		System.out.println(account);
//		account.setCustid((String)session.get("LOGIN_ID"));
		
//		account.setInterest(InterestManager.getInterest(account.getAccounttype()));
		//balance,payment,interest
//		account.setStartdeposit((new Date()).toString());
//		account.setEnddeposit((new Date()).toString());
		//approval은 관리자 기능 넣고 하자(따로 액션에서 바꿔야할듯)
		
		
		dao.insertAccount(account);
		return SUCCESS; 
	}
	public String account2(){
		System.out.println("AccountAction.account2()");
		return SUCCESS; 
	}
	public String account3(){
		System.out.println("AccountAction.account3()");
		return SUCCESS; 
	}



	public Account getAccount() {
		return account;
	}




	public void setAccount(Account account) {
		this.account = account;
	}




	public String getAccountno() {
		return accountno;
	}




	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}








	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

}
