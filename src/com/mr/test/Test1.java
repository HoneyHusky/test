package com.mr.test;

import java.lang.reflect.Constructor;

import com.mr.reflect.User;

public class Test1 {

	public static void main(String[] args) throws Exception {
		//获取类加载器  1 2 3
		Class<?> forName = Class.forName("com.mr.reflect.User");
		//获取所有的公共的类构造器
//			Constructor<?>[] constructors = forName.getConstructors();
//			for (Constructor<?> constructor : constructors) {
//				System.out.println(constructor);
//			}
			//获取所有的类构造器（包括私有的）
//			Constructor<?>[] constructors = forName.getDeclaredConstructors();
//			for (Constructor<?> constructor : constructors) {
//				System.out.println(constructor);
//			}
//		获取无参的构造器；
//			Constructor<?> constructor = forName.getConstructor();
//			System.out.println(constructor);
		//创建实例
//			User user = (User) constructor.newInstance();
//			System.out.println(user);
//			Constructor<?> constructor = forName.getConstructor(Integer.class);
//			User user = (User)constructor.newInstance(1);
//			System.out.println(user);
		
		
//		Constructor<?> constructor = forName.getConstructor(Integer.class,String.class);
//		User user =(User) constructor.newInstance(2,"hehe");
//		System.out.println(user);
		
		
		//快速调用
//		User u =(User) forName.newInstance();
//		System.out.println(u);
		
		Constructor<?> constructor = forName.getDeclaredConstructor(Integer.class);
		constructor.setAccessible(true);
		User u =(User) constructor.newInstance(3);
		System.out.println(u);
	}
}
