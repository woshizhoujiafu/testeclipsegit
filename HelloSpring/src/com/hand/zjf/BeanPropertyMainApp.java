package com.hand.zjf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPropertyMainApp {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
		String nameString;
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.setMessage("Hello World A");
		obj.getMessage();
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		obj1.getMessage();
		

	}

}
