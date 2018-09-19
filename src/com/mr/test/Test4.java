package com.mr.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.mr.reflect.User;

public class Test4 {

	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		Class<?> forName = Class.forName("java.util.List");
		Method method = forName.getMethod("add",Object.class);
		method.invoke(list, "haha");
		System.out.println(list);
	}
}
