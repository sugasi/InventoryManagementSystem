package inv.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import inv.bean.User;
import inv.dao.UserServiceDao;

public class UserService {

	public boolean addUser(User user) {
		UserServiceDao serviceDao = new UserServiceDao();
		try {
			return serviceDao.addUser(user);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public ResultSet getUsers() {
		UserServiceDao serviceDao = new UserServiceDao();
		try {
			return serviceDao.getUser();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean updateUser(User user) {
		UserServiceDao serviceDao = new UserServiceDao();
		try {
			return serviceDao.updateUser(user);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
