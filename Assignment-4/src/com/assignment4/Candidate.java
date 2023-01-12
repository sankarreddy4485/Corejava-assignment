package com.assignment4;

public class Candidate {

	private String name;
	private int age;
	private String education;
	
	
	public Candidate(String name, int age, String education) {
		super();
		this.name = name;
		this.age = age;
		this.education = education;
	}
	public Candidate() {
		// TODO Auto-generated constructor stub
	}
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
	public String getEducation() {
		return education;
	}
	
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + ", education=" + education + "]";
	}
	
	
}
