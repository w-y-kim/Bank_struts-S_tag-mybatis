package sesschool.bank.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sesschool.bank.dao.AccountDAO;
import sesschool.bank.util.AccountIDManager;
import sesschool.bank.util.InterestManager;
import sesschool.bank.vo.Account;


public class AccountAction extends ActionSupport implements SessionAware{

	private Account account;//FIXME 가입과 다르게 아이디 체크가 없어서 생성필요함 
	private String accountno; 	
	private Map<String, Object> session;

	private AccountDAO dao = new AccountDAO();
	private List<Account> accountList;



public String execute() {
		System.out.println("AccountAction.excute()");
		
		setAccountno(AccountIDManager.newAccountNo());//계좌생성해 초기값으로 넣어줌
		//custid는 세션값을 전송시에 넣어서 보냄
		return SUCCESS;
	}

	public String haveAccount(){
		System.out.println("AccountAction.haveAccount()");

		accountList = (List<Account>) dao.getAccountList((String)session.get("LOGIN_ID")); 
		System.out.println(accountList);
		
		return SUCCESS; 
	}
	public String account1(){
		System.out.println("AccountAction.account1()");
		System.out.println(account);
		

		//balance,payment,interest
//		account.setStartdeposit((new Date()).toString());
//		account.setEnddeposit((new Date()).toString());
		
		//approval은 관리자 기능 넣고 하자(따로 액션에서 바꿔야할듯)
		
		
		dao.insertAccount(account);
		return SUCCESS; 
	}
	public String account2(){
		System.out.println("AccountAction.account2()");
		System.out.println(account);
		account.setInterest(InterestManager.getInterest(account.getAccounttype()));
		
		dao.insertAccount(account);
		return SUCCESS; 
	}
	public String account3(){
		System.out.println("AccountAction.account3()");
		account.setInterest(InterestManager.getInterest(account.getAccounttype()));

		dao.insertAccount(account);
		return SUCCESS; 
	}
	
	//버튼을 위한 액션 메소드
	public String deposit(){
		System.out.println("AccountAction.deposit()");
		return SUCCESS; 
	}
	public String withdraw(){
		System.out.println("AccountAction.withdraw()");
		return SUCCESS; 
	}
	public String transfer(){
		System.out.println("AccountAction.transfer()");
		return SUCCESS; 
	}
	public String transferList(){
		System.out.println("AccountAction.transferList()");
		return SUCCESS; 
	}
	public String loan(){
		System.out.println("AccountAction.loan()");
		return SUCCESS; 
	}
	
	
	
	
//getter & setter
	public Account getAccount() {
		System.out.println("GETTER");
		return account;
	}

	public void setAccount(Account account) {
		System.out.println("ACCOUNT ACTION ACCOUNT.SETTER"+account);
		this.account = account;
	}
	
	public String getAccountno() {
		System.out.println("no getter");
		return accountno;
	}

	public void setAccountno(String accountno) {
		System.out.println("no setter:" + accountno);
		this.accountno = accountno;
	}

	
	
	

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}



}
