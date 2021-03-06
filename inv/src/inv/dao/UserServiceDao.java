package inv.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import inv.bean.User;
import inv.config.DatabaseConfig;

public class UserServiceDao {

	public boolean addUser(User user) throws SQLException {
		String query = "INSERT INTO USER VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		preparedStatement.setString(1, user.getSalutation());
		preparedStatement.setString(2, user.getFirstName());
		preparedStatement.setString(3, user.getLastName());
		preparedStatement.setString(4, user.getGender());
		preparedStatement.setString(5, user.getMobile());
		preparedStatement.setString(6, user.getEmail());
		preparedStatement.setString(7, user.getAddress());
		preparedStatement.setString(8, user.getRole());
		preparedStatement.setString(9, user.getStatus());
		return preparedStatement.execute();
	}
	
	public ResultSet getUser() throws SQLException {
		String query = "SELECT * FROM USER";
		Statement statement = DatabaseConfig.getConnection().createStatement();
		statement.execute(query);
		return statement.getResultSet();
	}
	
	public boolean updateUser(User user) throws SQLException {
		String query = "UPDATE USER SET salutation = ? , firstName = ?, lastName = ?, gender = ?, mobile = ?, email = ?, address = ? "
				+ ", role = ? WHERE userId = ?";
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		preparedStatement.setString(1, user.getSalutation());
		preparedStatement.setString(2, user.getFirstName());
		preparedStatement.setString(3, user.getLastName());
		preparedStatement.setString(4, user.getGender());
		preparedStatement.setString(5, user.getMobile());
		preparedStatement.setString(6, user.getEmail());
		preparedStatement.setString(7, user.getAddress());
		preparedStatement.setString(8, user.getRole());
		preparedStatement.setString(9, user.getStatus());
		preparedStatement.setLong(10, user.getUserId());
		return preparedStatement.execute();
	}
}
