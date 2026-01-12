package com.rays.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rays.AppConfig;

public class TestUserService {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		UserService userService = context.getBean(UserService.class);
//
//		userService.testAdd();
		
//		UserServiceByConstructor userServiceByConstructor = context.getBean(UserServiceByConstructor.class);
//		
//		userServiceByConstructor.testAdd();
		
//		UserServiceByName userServiceByName = context.getBean(UserServiceByName.class);
//		
//		userServiceByName.testAdd();
		
		UserServiceBySetter userServiceBySetter = context.getBean(UserServiceBySetter.class);
		
		userServiceBySetter.testAdd();
	}

}
