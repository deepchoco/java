package com.varxyz.jvx330.di.example1;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		String config="com/varxyz/jvx330/di/example1/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		Foo foo = context.getBean("foo", Foo.class);//객체생성을 컨테이너에게 위임
		System.out.println(foo);
		context.close();
		
		Foo foo2 = context.getBean("foo", Foo.class);
		System.out.println(foo2);
		//foo, foo2 이름을 다르게해도 해쉬코드값이 같게나옴 = 같은 객체를 사용하고있다.
		//bean이 하나만 등록되어 있을경우 해시코드 값이 같다. 두개를 등록시 값이 달라짐.
		
		context.close();
		
//		Bar bar = new Bar();
//		Foo foo = new Foo(bar);
	}
}
