import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTtest {
	public static void main(String[] args) {
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("1. driver...loaded");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","root123");
			System.out.println("2. Connected to the DB :"+conn);
			
			Statement statement = conn.createStatement();
			System.out.println("3. Statement created....");
			
			ResultSet result= statement.executeQuery("SELECT * FROM EMPLOYEE");
			System.out.println("4. execute the query");
			
			System.out.println("5. acquire the result and process it");
			while(result.next()) {
				System.out.println("EMPNO : "+result.getInt(1));
				System.out.println("ENAME : "+result.getString(2));
				System.out.println("JOB   : "+result.getString(3));
				System.out.println("SAL   : "+result.getInt(4));
				System.out.println("------------------------------------");
			}
			
			System.out.println("6. db resources closed....");
			result.close();
			statement.close();
			conn.close();
			System.out.println("DB resources are closed...");
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
