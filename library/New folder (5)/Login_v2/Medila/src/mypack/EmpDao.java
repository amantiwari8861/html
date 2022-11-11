package mypack;
import java.sql.*;

public class EmpDao {

	
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");
		}catch(Exception e){System.out.println("connnection failed");}
		return con;
	}
	public static int save(Emp e){
		int status=0;
		try{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into emps(first_name,last_name,email,phone) values (?,?,?,?)");
			ps.setString(1,e.getFirst_name());
			ps.setString(2,e.getLast_name());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getPhone());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	}
