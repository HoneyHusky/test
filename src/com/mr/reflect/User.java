package com.mr.reflect;

public class User {

	public Integer id;
	public String name;
	private  String sex;
	
	private User(Integer id) {
		this.id=id;
	}
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("�вι���");
	}
	public User() {
		super();
		System.out.println("�޲ι���");
	}
	private Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
