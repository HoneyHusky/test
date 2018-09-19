package com.mr.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.mr.reflect.User;

public class Test2 {

	public static void main(String[] args) throws Exception {
		//获取类加载器  1 2 3
		Class<?> forName = Class.forName("com.mr.reflect.User");
		//获取所有的的公共的成员变量
//		Field[] fields = forName.getFields();
//		for (Field field : fields) {
//			System.out.println(field);
//		}
		//获取所有的成员变量(包含私有的)
//		Field[] fields = forName.getDeclaredFields();
//		for (Field field : fields) {
//			System.out.println(field);
//		}
		
//		Object object = forName.newInstance();
//		//获取单个的公共的成员变量
//		Field field = forName.getField("id");
//		field.set(object, 1);
//		System.out.println(object);
		
		Object object = forName.newInstance();
		//获取单个的公共的成员变量
		Field field = forName.getDeclaredField("sex");
		field.setAccessible(true);
		field.set(object, "nan");
		System.out.println(object);
		
		
		
	}
}
