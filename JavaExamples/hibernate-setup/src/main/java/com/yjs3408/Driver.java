package com.yjs3408;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("John");
		employee.setLastName("DOE");
		employee.setSalary(2200f);
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
