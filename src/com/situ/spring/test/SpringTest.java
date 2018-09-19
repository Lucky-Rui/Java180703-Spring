package com.situ.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void test01() {
		//得到Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从Spring中取出bean
	}
}
