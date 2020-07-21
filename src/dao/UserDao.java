package dao;

import java.util.List;

import entity.User;


public interface UserDao {
	int search(User user);//��ѯ�Ƿ���ڴ��û�
	int add(User user);//����û�
	
	void add1(User user);//����վ�ָ�����ʱ��ӵ�user��
	int delete(User user);//ɾ���û�
	int update(User user);//�޸��û�
	List<User> searchAllBySelf(User user);//�鿴���˵�������Ƭ
	int addBin(User u);
	List<User> searchBin(User user);//��ѯ����վ��
	void deleteBin(User user);//ɾ������վ��
	
	List<User> search(String name);// ��������ģ����ѯ
	List<User> searchBinByMH(String name);// ���������ڻ���վģ����ѯ

}
