package cn.Guitars.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;



@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor{
   	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		return null;
		// TODO Auto-generated method stub
		/*@SuppressWarnings({ "static-access" })
		Map<String, Object> session = invocation.getInvocationContext().getContext().getSession();
		HttpServletRequest request=ServletActionContext.getRequest();
		String loginhtml = request.getRequestURI();
		String actionName = invocation.getProxy().getActionName();
		if ((session.get("admins_idcs")!=null||session.get("teachers_idcs")!=null||session.get("students_idcs")!=null )
				||actionName.equals("Check_Check_StudentsEmail")||actionName.equals("Check_Check_StudentsId")||actionName.equals("Check_Check_StudentsLogin")||actionName.equals("Check_StudentsLogin")||actionName.equals("StudentsLogin")||
				actionName.equals("Forgetpass")
				||actionName.equals("Check1_Check_TeachersLogin")||actionName.equals("Check_TeachersLogin")||actionName.equals("TeachersLogin")||
				actionName.equals("Check2_Check_AdminsLogin")||actionName.equals("Check_AdminsLogin")||actionName.equals("AdminsLogin")||
				actionName.equals("addstudent")||
				loginhtml.equals("/EMS/login")||loginhtml.equals("/EMS/register")||loginhtml.equals("/EMS/forgetpass")){
			return invocation.invoke();
		}
		ActionContext.getContext().put("message", "您无权直接访问该页面！请先登录");
		return "login";*/
		
	}

}
