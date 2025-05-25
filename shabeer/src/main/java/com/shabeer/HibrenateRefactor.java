package com.shabeer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibrenateRefactor {

	public static void main(String[] args) {
			// insert the below data are stored 
		Student s1 = new Student();
		s1.setEmployeeID(1);
		s1.setFirstName("sam");
		s1.setSalary(10000);
		
//		Configuration cfg = new Configuration();
//		cfg.addAnnotatedClass(com.shabeer.Student.class);
//		cfg.configure(); 
		//convert the below program like below 
		SessionFactory sf =  new Configuration()
							.addAnnotatedClass(com.shabeer.Student.class)
							.configure()
							.buildSessionFactory() ;  // cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tc =  session.beginTransaction();
		session.persist(s1);
		tc.commit();
		session.close();
		sf.close();
		System.out.println(s1);
		
	}

}
