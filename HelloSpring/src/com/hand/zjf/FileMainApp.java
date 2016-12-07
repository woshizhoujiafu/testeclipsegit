package com.hand.zjf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileMainApp {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ApplicationContext context = new FileSystemXmlApplicationContext("D:/eclipse-file/myfile/HelloSpring/src/Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	}

}
