package com.rays.autowire;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDAOImpl implements UserDAOInt {

	@Override
	public void add() {
		System.out.println("add method..!!");
	}

}
