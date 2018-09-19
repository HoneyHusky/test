package com.mr.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.mr.reflect.User;

public class Test3 {

	public static void main(String[] args) throws Exception {
		//获取类加载器  1 2 3
		Class<?> forName = Class.forName("com.mr.reflect.User");
		//调用所有的公共方法（包含父类的）
//		Method[] methods = forName.getMethods();
//		for (Method method : methods) {
//			System.out.println(method );
//		}
		//调用所有的本类的方法（包含私有的）
//		Method[] methods = forName.getDeclaredMethods();
//		for (Method method : methods) {
//			System.out.println(method );
//		}
		
		//获取单个公共的
//		Object obj = forName.newInstance();
//		Method method = forName.getMethod("setId", Integer.class);
		//执行方法
//		method.invoke(obj,1);
//		System.out.println(obj);
		
		//获取单个私有的
		Object obj = forName.newInstance();
		Method method = forName.getDeclaredMethod("setName", String.class);
		//俗称暴力破解
		method.setAccessible(true);
		//执行方法
		method.invoke(obj,"heihei");
		System.out.println(obj);
		
	}
}
