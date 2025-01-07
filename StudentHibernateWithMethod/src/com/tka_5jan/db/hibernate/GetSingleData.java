package com.tka_5jan.db.hibernate;

import org.hibernate.Session;

import com.tka_4jan.entityclass.Student1;

public class GetSingleData {
	public void GetSingleRecord(Session session) {
		int Sid=1;
		Student1 S=session.get(Student1.class, Sid);
		System.out.println(S);
		
		System.out.println("Data is GetSingle Record");
		
	}

}
