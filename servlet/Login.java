package com.bank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/validate")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("auth_user");
		String pass = request.getParameter("auth_key");
		String rem[] = request.getParameterValues("remember");
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<head>");
			out.println("<title>Login Validate - Bank</title>");
			out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\" type=\"text/css\" />");
			out.println("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\" type=\"text/css\" />");
			out.println("</head>");
			out.println("<body>");
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "secure");
				PreparedStatement psStmt = connection.prepareStatement("SELECT * FROM LOGIN_TBL WHERE USERNAME=? AND PASSWORD=?");
				psStmt.setString(1, user);
				psStmt.setString(2, pass);
				ResultSet rs = psStmt.executeQuery();
				if(rs.next()) {
					out.println("<p class=\"bg-success\">Login Success</p>");
				} else {
					out.println("<p  class=\"bg-danger\">Login Error</p>");
				}
				out.println("<b>Testing Web.</b><br><b>User: </b>"+user+"<br><b> pass: </b>"+pass);
				for(int i = 0; i < rem.length; i++) {
					out.println("<br><b>Remember : </b>"+rem[i]);
				}
			} catch(Exception e) {
				out.println(e);
			}
			out.println("</body>");
			out.println("</html>");
		}
		
	}

}
