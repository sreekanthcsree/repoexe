package com.dex.dao;

import com.dex.entity.Login;
import com.dex.entity.User;

public interface UserDao {
	
	int register(User user);
	User validateUser(Login login);

}
