package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.AppConfig;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Person p = (Person) context.getBean("person");

		p.setName("Aastik");
		p.setAddress("Ujjain");

		System.out.println(p.getName());
		System.out.println(p.getAddress());
		
		System.out.println("---------------------------------------------");
		
		Person p1 = (Person) context.getBean("person");

		p1.setName("Abhay");
		p1.setAddress("Ujjain");

		System.out.println(p1.getName());
		System.out.println(p1.getAddress());

	}

}
