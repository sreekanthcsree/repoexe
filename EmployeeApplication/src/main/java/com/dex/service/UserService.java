package com.dex.service;

import com.dex.entity.Login;
import com.dex.entity.User;

public interface UserService {
	
	int register(User user);

	User validateUser(Login login);


}
