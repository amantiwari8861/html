package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("first_name");
		String password=request.getParameter("last_name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		Emp e=new Emp();
		e.setFirst_name(name);
		e.setLast_name(password);
		e.setEmail(email);
		e.setPhone(phone);
		
		int status=EmpDao.save(e);
		if(status>0){
			
			out.print("<p>Record saved successfully!</p>");
		
			request.getRequestDispatcher("index04b9.html").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		}
		
		
		out.close();
	}

}
