package Assignment7;

import java.io.IOException;

public class Servlet extends HttpServlet {
	private static final long serialVersionUID =1L;
	
	public Servlet() {
		
	}
  protected void doGet(HttpServletRequest request,HttpServletResponse responce)
       throws ServletException,IOException {
	  
  }
  protected void doPost(HttpServletRequest request,HttpServletResponse response)
      throws ServletException,IOException{
	  //TODO Auto-generated method stub
	  String username = request.getParameter("username");
	  String password = request.getParameter("password");
	  if (username.equals("Sailatha") && password.equals("14450"))
		  response.getWriter().append("Welcome Sailatha");
	  else {
		  response.getWriter().append("Invalid Username OR Password...!");
		  response.getWriter().append("<a href='loginPage.html'> <br><br> Click here to LogIn again</a>");
	  } 
  }
}
