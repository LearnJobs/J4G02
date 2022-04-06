package Assignment7;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */

public class Registration extends HttpServlet {
		private static final long serialVersionUID = 1L;

	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public Registration() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String uname = request.getParameter("uname");
			String psw = request.getParameter("psw");
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String uname = request.getParameter("uname");
			String psw = request.getParameter("psw");
			PrintWriter pw = response.getWriter();
			String connectionURL = "jdbc:mysql://localhost/learnjob";
			Connection connection;

			try{
				  String username = request.getParameter("uname");
				  String password = request.getParameter("psw");
				  pw.println(username);
				  pw.println(password);
				  Class.forName("org.gjt.mm.mysql.Driver");
				  connection = DriverManager.getConnection
				  (connectionURL, "root", "biki");
				  PreparedStatement pst = connection.prepareStatement
				  ("insert into emp_info values(?,?)");
				  pst.setString(1,username);
				  pst.setString(2,password);
				  int i = pst.executeUpdate();
				  if(i!=0){
				  pw.println("<br>Record has been inserted");
				  }
				  else{
				  pw.println("failed to insert the data");
				  }
				  }
				  catch (Exception e){
				  pw.println(e);
				  }
		}

	}

