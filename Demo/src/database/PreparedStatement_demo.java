package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class PreparedStatement_demo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		// Create a callable statement
		CallableStatement callStmt = con.prepareCall("{call registerStudent(?,?}"); 
		// Set the student_id parameter
		callStmt.setInt(1, 1001);  
		// Register the out parameter
		callStmt.registerOutParameter(2, java.sql.Types.INTEGER);

		callStmt.execute();
		// Get the out parameter value
		int outRet = callStmt.getInt(2);

		System.out.println("Registration No: " + outRet);

	}

}
