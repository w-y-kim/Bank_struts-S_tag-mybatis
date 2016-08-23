package sesschool.bank.action;

import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.opensymphony.xwork2.ActionSupport;

import sesschool.bank.dao.CustomerDAO;
import sesschool.bank.dao.MybatisConfig;
import sesschool.bank.vo.Customer;

public class CustomerAction extends ActionSupport {

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
		return SUCCESS;
	}

	public String join_pop() {
		System.out.println("CustomerAction.join_pop()");
		System.out.println(custid);

		customer = dao.selectCustomer(custid);
		System.out.println("db에서 받아온 객체 : "+customer);
		if (customer == null) {
			duplicated = true;
		} else {
			duplicated = false;
		}
		System.out.println(duplicated+"db거친 팝업액션의 플래그값 : true면 사용 가능");
		
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
