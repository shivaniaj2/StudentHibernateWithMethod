package com.tka_4jan.entityclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 {
	@Id
	private int Sid;
	private String Sname;
	private long phoneno;
	private int age;
	
	public Student1() {
		
	}

	public Student1(String sname, int id, long phoneno, int age) {
		super();
		Sname = sname;
		this.Sid = id;
		this.phoneno = phoneno;
		this.age = age;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getId() {
		return Sid;
	}

	public void setId(int id) {
		this.Sid = id;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [Sname=" + Sname + ", id=" + Sid + ", phoneno=" + phoneno + ", age=" + age + "]";
	}
	
	

}
