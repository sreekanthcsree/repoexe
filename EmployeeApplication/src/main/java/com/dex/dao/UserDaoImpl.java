package com.dex.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dex.entity.Login;
import com.dex.entity.User;

public class UserDaoImpl implements UserDao{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into users values(?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstName(),
		        user.getLastName(), user.getEmail(), user.getAddress(), user.getMobileNo() });
	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword()+ "'";
         List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
	}
}

class UserMapper implements RowMapper<User> {

	  public User mapRow(ResultSet rs, int arg1) throws SQLException {
	    User user = new User();

	    user.setUsername(rs.getString("username"));
	    user.setPassword(rs.getString("password"));
	    user.setFirstName(rs.getString("firstName"));
	    user.setLastName(rs.getString("lastName"));
	    user.setEmail(rs.getString("email"));
	    user.setAddress(rs.getString("address"));
	    user.setMobileNo(rs.getString("mobileNo"));

	    return user;
	  }
	}
