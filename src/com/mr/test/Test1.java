package com.mr.test;

import java.lang.reflect.Constructor;

import com.mr.reflect.User;

public class Test1 {

	public static void main(String[] args) throws Exception {
		//��ȡ�������  1 2 3
		Class<?> forName = Class.forName("com.mr.reflect.User");
		//��ȡ���еĹ������๹����
//			Constructor<?>[] constructors = forName.getConstructors();
//			for (Constructor<?> constructor : constructors) {
//				System.out.println(constructor);
//			}
			//��ȡ���е��๹����������˽�еģ�
//			Constructor<?>[] constructors = forName.getDeclaredConstructors();
//			for (Constructor<?> constructor : constructors) {
//				System.out.println(constructor);
//			}
//		��ȡ�޲εĹ�������
//			Constructor<?> constructor = forName.getConstructor();
//			System.out.println(constructor);
		//����ʵ��
//			User user = (User) constructor.newInstance();
//			System.out.println(user);
//			Constructor<?> constructor = forName.getConstructor(Integer.class);
//			User user = (User)constructor.newInstance(1);
//			System.out.println(user);
		
		
//		Constructor<?> constructor = forName.getConstructor(Integer.class,String.class);
//		User user =(User) constructor.newInstance(2,"hehe");
//		System.out.println(user);
		
		
		//���ٵ���
//		User u =(User) forName.newInstance();
//		System.out.println(u);
		
		Constructor<?> constructor = forName.getDeclaredConstructor(Integer.class);
		constructor.setAccessible(true);
		User u =(User) constructor.newInstance(3);
		System.out.println(u);
	}
}
