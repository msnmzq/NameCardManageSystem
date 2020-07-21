package service;

import java.util.Iterator;
import java.util.List;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class AddService {
	public int add(User user) {
		UserDao dao=new UserDaoImpl();
		int add = dao.add(user);
		return add;
	}
	public void add(int n,List<User> list) {
		UserDao dao=new UserDaoImpl();
		Iterator<User> iterator = list.iterator();
		while(iterator.hasNext())
		{

			dao.add((User)iterator.next());
		}
		
	}
}
