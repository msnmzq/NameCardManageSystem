package service;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class ZCService {
	public int zc(User user) {
		UserDao dao = new UserDaoImpl();
		int re = dao.search(user);
		if (re == 1) {// ���˺��Ѵ��ڣ�����ע��
			return 1;
		} else {
			int res=dao.add(user);
			if(res==1) {
				return 0;//�������
			}else if(res==0)
				return -1;//û��������ӣ�����û���쳣
			else
				return -2;//��ӳ����쳣
			
		}
	}
}
