package com.dex.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dex.dao.UserDao;
import com.dex.entity.Login;
import com.dex.entity.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}
	
	

}
