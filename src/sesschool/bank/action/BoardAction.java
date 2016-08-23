package sesschool.bank.action;

import com.opensymphony.xwork2.ActionSupport;

public class BoardAction extends ActionSupport {
	
	public String execute(){
		System.out.println("CustomerAction.excute()");
		return SUCCESS;
	}
	public String answerlist(){
		System.out.println("CustomerAction.answerlist()");
		return SUCCESS;
	}
	public String answerview(){
		System.out.println("CustomerAction.answerview()");
		return SUCCESS;
	}
	public String loan(){
		System.out.println("CustomerAction.loan()");
		return SUCCESS;
	}
	public String list(){
		System.out.println("CustomerAction.list()");
		return SUCCESS;
	}
	public String view(){
		System.out.println("CustomerAction.view()");
		return SUCCESS;
	}
	public String write(){
		System.out.println("CustomerAction.write()");
		return SUCCESS;
	}
	

}
