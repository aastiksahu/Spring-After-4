package com.rays.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //tag nahi lagega kya setter servive me nahi lagane me error aa rahi aap ne git me nahi laga rakha hai @Value
public class UserServiceBySetter {
	
	private UserDAOInt userDao;

	@Autowired
	public void setUserDao(UserDAOInt userDao) {
		this.userDao = userDao;
	}
	
	public void testAdd() {
		userDao.add();
	}

}
