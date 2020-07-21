package service;
import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;
public class DeleteService {
	//删除user,添加到回收站表
	public void delete(User u) {
		UserDao dao=new UserDaoImpl();
		dao.delete(u);
		dao.addBin(u);
	}
	public void deleteBin(User u) {
		UserDao dao=new UserDaoImpl();
		dao.deleteBin(u);
	}
	public void recoverBin(User user) {
		UserDao dao=new UserDaoImpl();
		dao.deleteBin(user);
		dao.add1(user);
	}
}
