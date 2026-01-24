package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VideoDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	public static List<Video> validate (String category){
		
		ArrayList<Video> videos = new ArrayList<>();
	
		
	
		//validate
		try {
		
			con = DBConnect.getConnection();	
			stmt = con.createStatement();
			String sql = "select * from video where category='"+category+"'";		
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String Title = rs.getString(2);
				String Description = rs.getString(3);
				String Category = rs.getString(4);
				String File_Path = rs.getString(5);
				String Uploaded_by = rs.getString(6);
				
				Video v = new Video(id,Title,Description,Category,File_Path,Uploaded_by);
				videos.add(v);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return videos;
	}
	
	public static boolean insertVideo(String title,String description,String category,String file_path,String uploaded_by) {
		boolean isSuccess = false;
		
		
		
		try {
            
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql ="insert into video values(0,'"+title+"','"+description+"','"+category+"','"+file_path+"','"+uploaded_by+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
	public static boolean updateVideo(String id,String title,String description,String category,String file_path,String uploaded_by) {
		boolean isSuccess = false;
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "UPDATE video SET title='" + title + "', description='" + description + 
		             "', category='" + category + "', file_path='" + file_path + 
		             "', uploaded_by='" + uploaded_by + "' WHERE id='" + id + "'";

			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		return isSuccess;
		
	}

	public static List<Video> getVideoDetails(String Id){
		
		//wrapper class
		int convertedID = Integer.parseInt(Id);
		ArrayList<Video> video = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from video where id = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String description = rs.getString(3);
				String category = rs.getString(4);
				String file_path = rs.getString(5);
				String uploaded_by = rs.getString(6);
				
				
				Video v = new Video(id,title,description,category,file_path,uploaded_by);
				video.add(v);
						
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return video;
	}
	
	public static boolean deleteVideo(String Id) {
		boolean isSuccess = false;
		
		//wrapper class
		int convertedID = Integer.parseInt(Id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from video where id = '"+convertedID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

		return isSuccess;
	}

	
}		
		