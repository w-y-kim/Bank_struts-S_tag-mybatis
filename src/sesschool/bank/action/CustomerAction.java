package sesschool.bank.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sesschool.bank.dao.CustomerDAO;
import sesschool.bank.vo.Customer;

public class CustomerAction extends ActionSupport implements SessionAware{

	private Customer customer;
	private String custid;
	private String password;
	private boolean duplicated;
	private Map<String, Object> session;

	CustomerDAO dao = new CustomerDAO();

	public String execute() {
		System.out.println("CustomerAction.excute()");
		return SUCCESS;
	}

	public String info() {
		System.out.println("CustomerAction.info()");
		System.out.println(customer);
		
		int result = dao.updateCustomer(customer); 
		if (result == 0) {
			return ERROR; 
		} else {
			return SUCCESS;
		}
	}

	public String join_pop() {
		System.out.println("CustomerAction.join_pop()");
		System.out.println(custid);

		customer = dao.selectCustomer(custid);
		System.out.println("db에서 받아온 객체 : " + customer);
		if (customer == null) {
			duplicated = true;
		} else {
			duplicated = false;
		}
		System.out.println(duplicated + "db거친 팝업액션의 플래그값 : true면 사용 가능");

		return SUCCESS;
	}

	public String join() {
		System.out.println("CustomerAction.join()");
		return SUCCESS;
	}

	public String joinResult() {
		System.out.println("CustomerAction.joinResult()");
		System.out.println(customer + "만들어진 커스터머 객체=============================");
		dao.insertCustomer(customer);

		return SUCCESS;
	}

	public String find_idpw() {
		System.out.println("CustomerAction.find_idpw()");
		return SUCCESS;
	}

	public String login() {
		System.out.println("CustomerAction.login()");
		customer = dao.selectCustomer(custid);
		System.out.println(customer);
		if(customer.getPassword().equals(password) == false){
			System.out.println("비밀번호 불일치");
			return ERROR;  
		}else{
			System.out.println("로그인성공");
			//세션저장해야함
			session.put("LOGIN_ID", customer.getCustid());
			return SUCCESS;
		}
		
	}
	public String logOut(){
		//로그인 안한 상태에서는 로그아웃 실행 안되게 하는 부분 생략(굳이 할 필요 없을 듯)
		session.clear();
		return SUCCESS;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isDuplicated() {
		return duplicated;
	}

	public void setDuplicated(boolean duplicated) {
		this.duplicated = duplicated;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session; 
	}

}
