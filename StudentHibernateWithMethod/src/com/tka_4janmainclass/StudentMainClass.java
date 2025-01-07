package com.tka_4janmainclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka_4jan.entityclass.Student1;
import com.tka_5jan.db.hibernate.DeleteData;
import com.tka_5jan.db.hibernate.GetSingleData;
import com.tka_5jan.db.hibernate.InsertDataStudent;
import com.tka_5jan.db.hibernate.UpdateData;

public class StudentMainClass {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student1.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		//**table created
//		Student1 s1=new Student1();
//		System.out.println("Application is Started");
		
		//**Data is Inserted
//		InsertDataStudent  SI=new InsertDataStudent ();
//		SI.Insertdata(ss);
//		
//		tr.commit();
//		ss.close();
//		sf.close();
		
		
        //**DATA IS GETSINGLE RECORD
//		GetSingleData G=new GetSingleData();
//		G.GetSingleRecord(ss);
//		
//		tr.commit();
//		ss.close();
//		sf.close();
		
		
        //**DATA IS DELETE
//		DeleteData D=new DeleteData();
//		D.DeleteRecord(ss);
//		
//		tr.commit();
//		ss.close();
//		sf.close();
		
        //**DATA IS Updated
		UpdateData U=new UpdateData();
		U.UpdateRecord(ss);
		
		tr.commit();
		ss.close();
		
	}
	

}
