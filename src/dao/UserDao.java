package dao;

import java.util.List;

import entity.User;


public interface UserDao {
	int search(User user);//查询是否存在此用户
	int add(User user);//添加用户
	
	void add1(User user);//回收站恢复数据时添加到user表
	int delete(User user);//删除用户
	int update(User user);//修改用户
	List<User> searchAllBySelf(User user);//查看本人的所有名片
	int addBin(User u);
	List<User> searchBin(User user);//查询回收站表
	void deleteBin(User user);//删除回收站表
	
	List<User> search(String name);// 根据姓名模糊查询
	List<User> searchBinByMH(String name);// 根据姓名在回收站模糊查询

}
