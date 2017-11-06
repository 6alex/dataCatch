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
	 // 获取代理对象
	 HelloWorld proxy = context.getBean("cfxClient", HelloWorld.class);
	 // 调用方法
	 System.out.println(proxy.sayHello("小明"));
	 
	 }
}
