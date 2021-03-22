package com.yjs3408;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Driver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = session.get(Employee.class, 1L);

		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getDepartment().getName());

		for (Project project : employee.getProjects()) {
			System.out.println(project.getName());
		}

//		Department department = new Department();
//		department.setName("IT");
//		session.save(department);
//		
//		Project xxxProject = new Project();
//		xxxProject.setName("XXX Project");
//		session.save(xxxProject);
//		
//		Project yyyProject = new Project();
//		yyyProject.setName("YYY Project");
//		session.save(yyyProject);
//		
//		Employee employee = new Employee();
//		employee.setFirstName("John");
//		employee.setLastName("DOR");
//		employee.setHiredDate(new Date());
//		employee.setBirthDate(new Date());
//		employee.setDepartment(department);
//		employee.getProjects().add(xxxProject);
//		employee.getProjects().add(yyyProject);
//		session.save(employee);

		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
