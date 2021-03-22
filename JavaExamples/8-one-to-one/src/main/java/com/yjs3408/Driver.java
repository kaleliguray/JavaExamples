package com.yjs3408;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
	
		
		
		Employee employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("DOE");
		employee.setBirthDate(new Date());
		employee.setHiredDate(new Date());
		employee.setDepartment(session.get(Department.class, 1L));
		employee.setSalary(2200.0f);
		
		
		
		
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setEmail("john.doe@example.com");
		contactInfo.setAddress("dummy address");
		contactInfo.setPhone("5554443322");
		employee.setContactInfo(contactInfo);
		
		
		session.save(employee);
		
		
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
