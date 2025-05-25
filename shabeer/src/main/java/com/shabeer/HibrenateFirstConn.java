package com.shabeer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibrenateFirstConn 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setEmployeeID(123);
		s1.setFirstName("shabeer1");
		s1.setSalary(89990);
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.shabeer.Student.class);
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tc =  session.beginTransaction();
		session.save(s1);
		tc.commit();
		sf.close();
		session.close();
		System.out.println(s1);
	}
}
