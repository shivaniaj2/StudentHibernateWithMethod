package com.tka_5jan.db.hibernate;

import org.hibernate.Session;

import com.tka_4jan.entityclass.Student1;

public class InsertDataStudent {
	public void Insertdata(Session session) {
		Student1 S1=new Student1();
		S1.setId(3);
		S1.setSname("komal");
		S1.setPhoneno(978956876);
		S1.setAge(25);
		
		session.persist(S1);
		System.out.println(S1);
		
		System.out.println("Student Data is Inserted Successfully");
		
	}

}
