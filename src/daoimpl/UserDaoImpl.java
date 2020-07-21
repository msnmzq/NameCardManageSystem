package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UserDao;

import entity.User;
import utils.JDBCUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public int search(User user) {
		// 根据登陆账号查询是否此账号已存在,存在返回1，不存在返回0
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from user where unumber=?";
//		System.out.println(user.getUnumber());
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, user.getUnumber());
			rs = ps.executeQuery();
			if (rs.next()) {

				return 1;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeResourse(conn, ps, rs);
		}

		return 0;
	}

	@Override
	public int add(User user) {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = null;
		int re = 0;
		String sql = "INSERT INTO USER (unumber,upassword,NAME,sex,email,profession,identity) VALUES(?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, user.getUnumber());
			ps.setObject(2, user.getUpassword());
			ps.setObject(3, user.getName());
			ps.setObject(4, user.getSex());
			ps.setObject(5, user.getEmail());
			ps.setObject(6, user.getProfession());
			ps.setObject(7, user.getIdentity());
			re = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			return -1;
		} finally {
			JDBCUtils.closeResourse(conn, ps);
		}

		return re;
	}
	//删除user表
	@Override
	public int delete(User user) {
		String sql="Delete from user where id=?";
		Connection conn = JDBCUtils.getConnection();
		 int update=0;
		PreparedStatement ps=null;
		try {
			 ps = conn.prepareStatement(sql);
			 ps.setObject(1, user.getId());
			 System.out.println(user.getId());
			 update = ps.executeUpdate();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResourse(conn, ps);
		}
		return update;
	}
	

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> searchAllBySelf(User user) {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> list=new  ArrayList<User>();
	
		String sql = "select * from user where unumber=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, user.getUnumber());
			rs = ps.executeQuery();
			while(rs.next()) {
				
				String id = rs.getString("id");		
				String unumber = rs.getString("unumber");
				String upassword = rs.getString("upassword");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String email = rs.getString("email");
				String profession = rs.getString("profession");
				String identity = rs.getString("identity");
				User u=new User(id,unumber,upassword,name,sex,email,profession,identity);
//				System.out.println(u);
				list.add(u);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			JDBCUtils.closeResourse(conn, ps,rs);
		}
		return list;
	}
	//添加到回收站表
	@Override
	public int addBin(User user) {
		
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = null;
		int re = 0;
		String sql = "INSERT INTO recyclebin  VALUES(?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, user.getId());
			ps.setObject(2, user.getUnumber());
		
			ps.setObject(3, user.getUpassword());
			ps.setObject(4, user.getName());
			ps.setObject(5, user.getSex());
			ps.setObject(6, user.getEmail());
			ps.setObject(7,user.getProfession());
			ps.setObject(8, user.getIdentity());
			re = ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			return -1;
		} finally {
			JDBCUtils.closeResourse(conn, ps);
		}

		return re;
	}

	@Override
	public List<User> searchBin(User user) {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> list=new  ArrayList<User>();
	
		String sql = "select * from recyclebin where unumber=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, user.getUnumber());
			rs = ps.executeQuery();
			while(rs.next()) {
				
				String id = rs.getString("id");		
				String unumber = rs.getString("unumber");
				String upassword = rs.getString("upassword");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				String email = rs.getString("email");
				String profession = rs.getString("profession");
				String identity = rs.getString("identity");
				User u=new User(id,unumber,upassword,name,sex,email,profession,identity);
//				System.out.println(u);
				list.add(u);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			JDBCUtils.closeResourse(conn, ps,rs);
		}
		return list;
	}

	@Override
	public void deleteBin(User user) {
		//根据id删除回收站此数据
		String sql="Delete from recyclebin where id=?";
		Connection conn = JDBCUtils.getConnection();
		
		PreparedStatement ps=null;
		try {
			 ps = conn.prepareStatement(sql);
			 ps.setObject(1, user.getId());
			 System.out.println(user.getId());
			ps.executeUpdate();
			 
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResourse(conn, ps);
		}
	
		
	}

	@Override
	public void add1(User user) {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = null;
	
		String sql = "INSERT INTO user  VALUES(?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, user.getId());
			ps.setObject(2, user.getUnumber());
		
			ps.setObject(3, user.getUpassword());
			ps.setObject(4, user.getName());
			ps.setObject(5, user.getSex());
			ps.setObject(6, user.getEmail());
			ps.setObject(7,user.getProfession());
			ps.setObject(8, user.getIdentity());
		    ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			JDBCUtils.closeResourse(conn, ps);
		}

		
	}

	@Override
	public List<User> search(String name) {
		List<User> list = new ArrayList<User>();
		if (name != "") {
			
			Connection conn = JDBCUtils.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String sql = "select * from user where name like '%" + name + "%'";
			try {
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				while (rs.next()) {
					String id = rs.getString("id");		
					String unumber = rs.getString("unumber");
					String upassword = rs.getString("upassword");
					String uname = rs.getString("name");
					String sex = rs.getString("sex");
					String email = rs.getString("email");
					String profession = rs.getString("profession");
					String identity = rs.getString("identity");
					User u=new User(id,unumber,upassword,uname,sex,email,profession,identity);
//					System.out.println(u);
					list.add(u);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();

			} finally {
				JDBCUtils.closeResourse(conn, pst, rs);
			}
		}

		return list;
	}

	@Override
	public List<User> searchBinByMH(String name) {
		
		List<User> list = new ArrayList<User>();
		if (name != "") {
			
			Connection conn = JDBCUtils.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String sql = "select * from recyclebin where name like '%" + name + "%'";
			try {
				pst = conn.prepareStatement(sql);
				rs = pst.executeQuery();
				while (rs.next()) {
					String id = rs.getString("id");		
					String unumber = rs.getString("unumber");
					String upassword = rs.getString("upassword");
					String uname = rs.getString("name");
					String sex = rs.getString("sex");
					String email = rs.getString("email");
					String profession = rs.getString("profession");
					String identity = rs.getString("identity");
					User u=new User(id,unumber,upassword,uname,sex,email,profession,identity);
//					System.out.println(u);
					list.add(u);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();

			} finally {
				JDBCUtils.closeResourse(conn, pst, rs);
			}
		}

		return list;
	}



}
