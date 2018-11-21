package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccessSystem implements DataAccess {

	DataAccessSystem() {
	}

	public void read(Dao dao) throws SQLException {
		String query = dao.getSql();
	
		Connection con = null;
		try {
			con = ConnectManager.Connect();

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			dao.unpackResultSet(rs);
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {

				}
			}
		}
	}

	public boolean write(Dao dao)  {
		String query =  dao.getSql();
		Connection con = null;
		try {
			con = ConnectManager.Connect();
			Statement stmt = con.createStatement();
			//System.out.println("the query: " + query);
			stmt.executeUpdate(query);
			//System.out.println("the query: " + query+" ran successfull.");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		} finally {
			if (con != null) {
				try {
					con.close();
					return false;
				} catch (Exception e) {
					return false;
				}
			}
		}
	}

	public static class ConnectManager {

		private static Connection connection = null;
		private static final String DB_URL = "jdbc:ucanaccess://src/MsAccessDb/LibraryManagementSystem.accdb";

		public static Connection Connect() {
			try {

				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			} catch (ClassNotFoundException cnfex) {
				System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
				cnfex.printStackTrace();
			}

			try {
				connection = DriverManager.getConnection(DB_URL);
			} catch (SQLException e) {

			}
			return connection;
		}

	}

}
