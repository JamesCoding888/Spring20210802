package com.study.spring.case05.aop_dancer;
import org.springframework.context.ApplicationContext;  
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main{
	public static void main(String[] args) {
		// Java 配置
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance performance = ctx.getBean("dancer", Performance.class); // 1. 第一種寫法
//		Performance performance = (Performance)ctx.getBean("dancer"); // 2. 第二種寫法
		performance.perform();
	}
}
