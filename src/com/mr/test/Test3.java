package com.mr.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.mr.reflect.User;

public class Test3 {

	public static void main(String[] args) throws Exception {
		//��ȡ�������  1 2 3
		Class<?> forName = Class.forName("com.mr.reflect.User");
		//�������еĹ�����������������ģ�
//		Method[] methods = forName.getMethods();
//		for (Method method : methods) {
//			System.out.println(method );
//		}
		//�������еı���ķ���������˽�еģ�
//		Method[] methods = forName.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method );
//		}
		
		//��ȡ����������
//		Object obj = forName.newInstance();
//		Method method = forName.getMethod("setId", Integer.class);
		//ִ�з���
//		method.invoke(obj,1);
//		System.out.println(obj);
		
		//��ȡ����˽�е�
		Object obj = forName.newInstance();
		Method method = forName.getDeclaredMethod("setName", String.class);
		//�׳Ʊ����ƽ�
		method.setAccessible(true);
		//ִ�з���
		method.invoke(obj,"heihei");
		System.out.println(obj);
		
	}
}
