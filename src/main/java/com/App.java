package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

public class App {
	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println(context);
		UserBean user1 = context.getBean("user", UserBean.class);// ioc --> search -> user -> spring.xml -> UserBean
		UserBean user2 = context.getBean("user", UserBean.class);
		UserBean user3 = context.getBean("user", UserBean.class);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user1.getPayment().getAmount());
		context.registerShutdownHook();

	}
}
