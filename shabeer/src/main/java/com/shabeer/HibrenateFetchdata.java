package com.shabeer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibrenateFetchdata {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		SessionFactory sf = new Configuration().addAnnotatedClass(com.shabeer.Student.class).configure().buildSessionFactory();
		Session session = sf.openSession();
		s1 = session.get(Student.class, 1);
		System.out.println(s1);
	}

}
