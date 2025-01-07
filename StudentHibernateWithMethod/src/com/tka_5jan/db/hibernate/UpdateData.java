package com.tka_5jan.db.hibernate;

import org.hibernate.Session;

import com.tka_4jan.entityclass.Student1;

public class UpdateData {
	public void UpdateRecord(Session session) {
		int Sid=1;
		Student1 S1=session.get(Student1.class, Sid);
		S1.setPhoneno(801020289);
		
		session.merge(S1);
		System.out.println("Data is Updated Successfully"); 
		
			
	}

}
