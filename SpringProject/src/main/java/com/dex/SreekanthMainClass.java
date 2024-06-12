package com.dex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SreekanthMainClass {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("NewFile.xml");
		Sreekanth s =(Sreekanth)ac.getBean("sree");
		s.display();
	}
	}

