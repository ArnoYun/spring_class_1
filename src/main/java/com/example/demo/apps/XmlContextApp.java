package com.example.demo.apps;

import com.example.demo.beans.MyBeanXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml"
		);

		MyBeanXml myBeanXml = context.getBean("myBeanXml", MyBeanXml.class);

		System.out.println(myBeanXml);
	}

}
