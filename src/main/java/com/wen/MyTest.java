package com.wen;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	ApplicationContext context = null;
	 @Before
	 public void init() {
	 context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 }
	 
	 @Test
	 public void testService() {
	 // ��ȡ�������
	 HelloWorld proxy = context.getBean("cfxClient", HelloWorld.class);
	 // ���÷���
	 System.out.println(proxy.sayHello("С��"));
	 
	 }
}
