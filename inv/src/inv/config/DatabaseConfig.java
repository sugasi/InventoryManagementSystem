package inv.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DatabaseConfig {

	private static Connection connection;
	
	
	private DatabaseConfig() throws Exception {
		throw new Exception("It's a singleton class.. Use getConnection Method to get the DB connection.");
	}
	
	private static Connection createConnection() throws SQLException {
		String connectionUrl = "jdbc:mysql://localhost:3306/root?serverTimezone=UTC";
		return DriverManager.getConnection(connectionUrl, "root", "password");
	}
	
	public static Connection getConnection() throws SQLException {
		if(Objects.isNull(connection)) {
			connection = createConnection();
		}
		return connection;
	}
}
