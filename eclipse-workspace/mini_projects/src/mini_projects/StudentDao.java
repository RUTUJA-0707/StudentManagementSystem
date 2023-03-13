package mini_projects;
import java.sql.*;
public class StudentDao {
	public static boolean insertStudentRecordToDB(Student st) {
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "insert into students(sname,sphone,scity,scourse ,stuition) values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.setString(4, st.getStudentcourse());
			pstmt.setString(5, st.getStudenttuition());
			//pstmt.setString(6, st.getStudentbalance());
			//pstmt.setFloat(7, st.getStudentName());
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static boolean deleteStudentRecordFromDB(String course) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "delete from students where scourse=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1, course);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static void showAllStudentRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createc();
			//String query = "select * from students";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery("select * from students");
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				String course = set.getString("scourse");
				String tuition = set.getString("stuition");
				//String balance= set.getString("sbalance");
				
				System.out.println("Student ID: " + id + "\n Student Name: " + name + "\nStudent Phone: " + phone + " \nStudent city: " + city+ " \nStudent course: "+course+ " \nStudent tuition: "+tuition);
				System.out.println("----------------------------------------------");
			
			
				f = true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	public static boolean updateStudentRecord(int val,String toUpdate,String course,Student st) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection con = CP.createc();
			 if(val == 1) {
					//Update Name
					
						String query = "update students set sname=? where scourse=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setString(2, course);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update Phone
					String query = "update students set sphone=? where scourse=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setString(2, course);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update City
					String query = "update students set scity=? where scourse=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					//pstmt.setString(1, toUpdate);
					//pstmt.setInt(2, id);
					
					pstmt.setString(1, toUpdate);
					pstmt.setString(2, course);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 4) {
					//Update City
					String query = "update students set scourse=? where scourse=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					//pstmt.setString(1, toUpdate);
					//pstmt.setInt(2, id);
					pstmt.setString(1, toUpdate);
					pstmt.setString(2, course);
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 5) {
					//Update City
					String query = "update students set stuition=? where scourse=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					//pstmt.setString(1, toUpdate);
					//pstmt.setInt(2, id);
					pstmt.setString(1, toUpdate);
					pstmt.setString(2, course);
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
}


