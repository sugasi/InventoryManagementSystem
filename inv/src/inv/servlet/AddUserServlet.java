package inv.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import inv.bean.User;
import inv.service.UserService;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		User user = new User();
		user.setSalutation(httpServletRequest.getParameter("salutation"));
		user.setFirstName(httpServletRequest.getParameter("firstName"));
		user.setLastName(httpServletRequest.getParameter("lastName"));
		user.setGender(httpServletRequest.getParameter("gender"));
		user.setEmail(httpServletRequest.getParameter("email"));
		user.setMobile(httpServletRequest.getParameter("mobile"));
		user.setAddress(httpServletRequest.getParameter("address"));
		user.setRole(httpServletRequest.getParameter("role"));
		user.setStatus(httpServletRequest.getParameter("status"));
		
		UserService userService = new UserService();
		boolean status = userService.addUser(user);
		if(status) {
			httpServletRequest.setAttribute("status", "success");
		} else {
			httpServletRequest.setAttribute("status", "failure");
		}
	}
	
	

}
