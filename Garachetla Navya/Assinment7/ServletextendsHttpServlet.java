import java.io.IOException
public class ServletextendsHttpServlet {
	private static final long  serialVerionID=11;
	public Servlet{
		protected void  doget(HttpServletRequest request,HttpServletResponse response)
		throws ServletException IOException{
			protected void dopost(HttpServletRequest request,HttpservletResponse response)
			throws servletExcepion,IoException{
				String username =request.getparameter("username");
				String password=request.getparameter("password");
				if(username.equals("Navya")&& password.equals("14450"))
					response.getWriter().append("Welcome Navya");
				else {
					response.getwriter().append("Invalid username OR password...!");
					response.getwriter().append("< href='loginpage.html"><br> <br>Click here to Login again</a>");"
							
				}
			}
		}
	
