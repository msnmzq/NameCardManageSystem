package service;

import java.util.List;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class SearchService {
//��ͨ�û��鿴�Լ���������Ƭ
	public List <User> searchAllBySelf(User user){
		UserDao dao=new UserDaoImpl();
		List<User> list = dao.searchAllBySelf(user);
		return list;
	}
	//��ͨ�û��鿴����վ��Ƭ
	public List<User> searchBin(User user){
		UserDao dao=new UserDaoImpl();
		List<User> list=dao.searchBin(user);
		return list;
	}
	//�����û���������ģ����ѯ
	public List<User> searchByMH(String name){
		UserDao dao=new UserDaoImpl();
		List<User> user = dao.search(name);
		return user;
	}
	//�����û������ڻ���վģ����ѯ
	public List<User> searchBinByMH(String name){
		UserDao dao=new UserDaoImpl();
		List<User> user = dao.searchBinByMH(name);
		return user;
	}
}
