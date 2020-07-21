package service;

import java.util.List;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class SearchService {
//普通用户查看自己的所有名片
	public List <User> searchAllBySelf(User user){
		UserDao dao=new UserDaoImpl();
		List<User> list = dao.searchAllBySelf(user);
		return list;
	}
	//普通用户查看回收站名片
	public List<User> searchBin(User user){
		UserDao dao=new UserDaoImpl();
		List<User> list=dao.searchBin(user);
		return list;
	}
	//根据用户姓名进行模糊查询
	public List<User> searchByMH(String name){
		UserDao dao=new UserDaoImpl();
		List<User> user = dao.search(name);
		return user;
	}
	//根据用户姓名在回收站模糊查询
	public List<User> searchBinByMH(String name){
		UserDao dao=new UserDaoImpl();
		List<User> user = dao.searchBinByMH(name);
		return user;
	}
}
