package inv.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import inv.bean.Item;
import inv.config.DatabaseConfig;

public class ItemServiceDao {

	public boolean addItem(Item item) throws SQLException {
		String query = "INSERT INTO ITEM VALUES(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		preparedStatement.setString(1, item.getItemName());
		preparedStatement.setBlob(2, item.getItemImage());
		preparedStatement.setString(3, item.getItemCategory());
		preparedStatement.setString(4, item.getItemQuantity());
		preparedStatement.setString(5, item.getItemUnit());
		preparedStatement.setString(6, item.getItemUnitPrice());
		preparedStatement.setString(7, item.getItemStatus());
		return preparedStatement.execute();
	}

	public ResultSet getItem() throws SQLException {
		String query = "SELECT * FROM ITEM";
		Statement statement = DatabaseConfig.getConnection().createStatement();
		statement.execute(query);
		return statement.getResultSet();
	}

	public boolean updateItem(Item item) throws SQLException {
		String query = "UPDATE ITEM SET itemName = ?, itemImage = ?, itemCategory = ?, itemQuantity = ? , itemUnit = ?, itemUnitPrice = ?"
				+ ", itemStatus = ? WHERE itemId = ?";
		PreparedStatement preparedStatement = DatabaseConfig.getConnection().prepareStatement(query);
		preparedStatement.setString(1, item.getItemName());
		preparedStatement.setBlob(2, item.getItemImage());
		preparedStatement.setString(3, item.getItemCategory());
		preparedStatement.setString(4, item.getItemQuantity());
		preparedStatement.setString(5, item.getItemUnit());
		preparedStatement.setString(6, item.getItemUnitPrice());
		preparedStatement.setString(7, item.getItemStatus());
		preparedStatement.setLong(8, item.getItemId());
		return preparedStatement.execute();
	}
}
