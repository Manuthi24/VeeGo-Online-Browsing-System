package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = VideoDBUtil.deleteVideo(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("insert.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Video> videoDetails = VideoDBUtil.getVideoDetails(id);
			request.setAttribute("VideoDetails",videoDetails);
			 
			RequestDispatcher dispatcher = request.getRequestDispatcher("videoaccount.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
