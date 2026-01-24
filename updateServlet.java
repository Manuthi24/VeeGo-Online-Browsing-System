package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String title= request.getParameter("title");
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String file_path = request.getParameter("file_path");
		String uploaded_by = request.getParameter("uploaded_by");
		
		
		boolean isTrue;
		
		isTrue = VideoDBUtil.updateVideo(id, title, description, category, file_path, uploaded_by);
		
		if(isTrue == true) {
			
			List<Video> videoDetails = VideoDBUtil.getVideoDetails(id);
			request.setAttribute("VideoDetails",videoDetails);
			
			
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("videoaccount.jsp");
			dis.forward(request,response);
			
		}
		else {
			
			List<Video> videoDetails = VideoDBUtil.getVideoDetails(id);
			request.setAttribute("VideoDetails",videoDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("videoaccount.jsp");
			dis.forward(request,response);
			
		}
	}

}
