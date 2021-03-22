package com.yjs3408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Driver {

	public static void main(String[] args) throws ParseException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Employee employee = new Employee();
		employee.setFirstName("John");
		employee.setLastName("DOE");
		employee.setSalary(2200f);
		employee.setHiredDate(new Date());

		Date birthDate = new SimpleDateFormat("MM-yyyy/dd").parse("11-1973/04");

		employee.setBirthDate(birthDate);

		Transaction transaction = session.beginTransaction();
		session.save(employee);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
