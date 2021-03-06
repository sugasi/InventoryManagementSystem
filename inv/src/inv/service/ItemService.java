package inv.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import inv.bean.Item;
import inv.dao.ItemServiceDao;

public class ItemService {

	public boolean addItem(Item item) {
		ItemServiceDao serviceDao = new ItemServiceDao();
		try {
			return serviceDao.addItem(item);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public ResultSet getItem() {
		ItemServiceDao serviceDao = new ItemServiceDao();
		try {
			return serviceDao.getItem();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean updateItem(Item item) {
		ItemServiceDao serviceDao = new ItemServiceDao();
		try {
			return serviceDao.updateItem(item);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
