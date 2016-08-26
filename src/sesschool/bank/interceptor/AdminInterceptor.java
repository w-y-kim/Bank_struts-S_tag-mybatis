package sesschool.bank.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AdminInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();  
		Map<String,Object> session = ctx.getSession();
		
		String sessionID = (String) session.get("LOGIN_ID"); 
		if(sessionID == null){
			return Action.LOGIN;
		}else{
			return invocation.invoke();
		}
//		if(sessionID.equals("admin")){
//			
//		}
		
	}

}
