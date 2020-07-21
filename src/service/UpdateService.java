package service;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class UpdateService {
	public void update(User user) {
		UserDao dao=new UserDaoImpl();
		dao.delete(user);
		dao.add(user);
	}
}
