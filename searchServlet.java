package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String category = request.getParameter("category");
	
		
		
		try{
		  List<Video> videoDetails = VideoDBUtil.validate(category);
		  request.setAttribute("VideoDetails",videoDetails );
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("videoaccount.jsp");
		dis.forward(request, response);
		
		
	}

}