package service;
import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;
public class DeleteService {
	//ɾ��user,��ӵ�����վ��
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
