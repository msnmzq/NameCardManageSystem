package service;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class LoginService {
	public int login(User user) {
		UserDao dao = new UserDaoImpl();
		int re = dao.search(user);
		if(re==1) {
			return 1;
		}else
			return 0;
	}
}
