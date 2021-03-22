package com.yjs3408;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		
//		Employee employee = new Employee();
//		employee.setFirstName("John");
//		employee.setLastName("DOE");
//		employee.setDepartment(session.get(Department.class, 1L));
//		
//		session.beginTransaction();
//		session.save(employee);
//		session.getTransaction().commit();
		
		
		
		Employee employee = session.get(Employee.class, 1L);
		
		System.out.println(employee);
		System.out.println(employee.getDepartment());
		
		
		
		
		session.close();
		sessionFactory.close();
	}
}
