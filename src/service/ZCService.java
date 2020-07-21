package service;

import dao.UserDao;
import daoimpl.UserDaoImpl;
import entity.User;

public class ZCService {
	public int zc(User user) {
		UserDao dao = new UserDaoImpl();
		int re = dao.search(user);
		if (re == 1) {// 此账号已存在，不可注册
			return 1;
		} else {
			int res=dao.add(user);
			if(res==1) {
				return 0;//正常添加
			}else if(res==0)
				return -1;//没能正常添加，但是没报异常
			else
				return -2;//添加出现异常
			
		}
	}
}
