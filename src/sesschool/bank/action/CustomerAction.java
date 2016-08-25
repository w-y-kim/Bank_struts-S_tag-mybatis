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
		//1.find_idpw.jsp 에서 전송된 정보를 받음 (셋으로 action클래스의 멤버변로 저장)
		//2.xml에서 find_idpw.jsp파일의 입력된 데이터를 전송시키는 form태그의 액션값과 맵핑된 액션을 찾음(find_Result)
		//3.사용자가 요청을 하면 find_Result 태그의 속성인 class의 메소드가 실행됨
		//4. find_idpw메소드에서는 사용자가 입력한 데이터를 받아서 쓴다. 
		
		//1. 찍어보기 
		//2. 들어온 프로퍼티를 찍어보기 
		//3. 받아온 값을 처리할 DAO 혹은 로직에 넣어준다. 
		//4. DAO의 selectCustomer 메소드를 실행한다. 파라미터로는 4번에서 받은 프로퍼티를 넣어준다. 
		//5. 액션클래스에서 프로티는 멤버변수로 만든 겟셋메소드의 이름에서 겟셋을 지우고 첫
		//6. DAO의 selectCustomer DB Customer를 리턴한다.()
		//7. 리턴한 값을 액션클래스 메소드 안에서 분기처리한다. 
		//8. 분기처리는 DB의 실행결과를 리절트 페이지에서도 알 수 있도록 사용한다. 
		//8. 일반 사용자에게 분기처리의 결과를 보여주는 방식은 결국 성공 , 실패하면 현재 머물도록 한다. 
		//9. 리턴되는 페이지로 분기처리 결과를 알리는 것 의외에도 액션의 메소드가 수행한 결과값등을 리절트페이에 표현가능다 .(EL싟 , S , 등의 커스텀 액션 )
		
		System.out.println(customer);//아이디로 찾을 때는 이름과 메일 , 패스워드로 찾을 때는 이름 메일 아이디 
		
		Customer result = dao.selectCustomer(customer.getName());
		if(result != null && result.getEmail().equals(customer.getEmail())){
			return SUCCESS;
		}else{
			return ERROR; 
		}
		
	}

	public String login() {
		System.out.println("CustomerAction.login()");
		customer = dao.selectCustomer(custid);
		System.out.println(customer);
		if(customer == null||customer.getPassword().equals(password) == false){
			System.out.println("비밀번호 불일치");
			return ERROR;  
		}else{
			System.out.println("로그인성공" +customer);
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
