package com.yjs3408;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Classroom classroom = new Classroom();
		classroom.setClassNumber("402");
		session.save(classroom);
		
		Student  student = new Student();
		student.setFirstName("Bahadır");
		student.setLastName("KARADAŞ");
		student.setClassroom(classroom);
		
		StudentNumber studentNumber = new StudentNumber();
		studentNumber.setStudentNumber("1A2C3D");
		student.setStudentNumber(studentNumber);
		
		session.save(student);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
