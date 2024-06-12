package com.dex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dex.entity.Login;
import com.dex.entity.User;
import com.dex.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:app/config/user-beans.xml" })
public class UserServiceTest {
	
	@Autowired
	  private UserService userService;

	  @Test
	  public void testRegister() {
	    User user = new User();
	    user.setUsername("ranjith");
	    user.setPassword("sekar");
	    user.setFirstName("Ranjith");
	    user.setLastName("Sekar");
	    user.setAddress("chennai, t.nagar");
	    user.setEmail("ranjith@gmail.com");
	    user.setMobileNo("98979767893");

	    int result = userService.register(user);
	    Assert.assertEquals(1, result);
	  }

	  @Test
	  public void testValidateUser() {
	    Login login = new Login();
	    login.setUsername("ranjith");
	    login.setPassword("sekar");

	    User user = userService.validateUser(login);
	    Assert.assertEquals("Ranjith", user.getFirstName());
	  }

	}

