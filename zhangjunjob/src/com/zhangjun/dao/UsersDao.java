package com.zhangjun.dao;

import java.sql.SQLException;

import com.zhangjun.bean.Users;

public interface UsersDao {

	//用户注册
	public int addusers(Users users) throws SQLException;
	
	//用户登陆
	public Users winUsers(Users users) throws SQLException;
	
}
