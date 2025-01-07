package com.tka_5jan.db.hibernate;

import org.hibernate.Session;

import com.tka_4jan.entityclass.Student1;

public class DeleteData {
	public void DeleteRecord(Session session) {
		int Sid=2;
		Student1 S=session.get(Student1.class, Sid);
		session.remove(S);
		
		System.out.println("Data is Deleted Successfully");
		
	}

}
