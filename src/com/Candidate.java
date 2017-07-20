package com;

public class Candidate {
	String name;
	int age;
	String degree;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Candidate(String name, int age, String degree) {
	
		this.name = name;
		this.age = age;
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + ", degree=" + degree + "]";
	}
	
	

}
