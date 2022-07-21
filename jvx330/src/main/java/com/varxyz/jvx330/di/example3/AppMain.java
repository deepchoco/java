package com.varxyz.jvx330.di.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		//xml에서 설정시
//		String config = "com/varxyz/jvx330/di/example3/beans.xml";
//		GenericApplicationContext context = new GenericXmlApplicationContext(config);
//		MemberService mem = context.getBean("memberservice", MemberService.class);
//		mem.getAllMembers().forEach(member -> System.out.println(member));
//		context.close();
		
		//AppConfig.java에서 설정시(경로설정 필요없음)
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MemberService mem = context.getBean("memberService", MemberService.class);
		mem.getAllMembers().forEach(member -> System.out.println(member));
		context.close();
	}
}
