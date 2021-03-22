package com.yjs3408.model.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.yjs3408.model.entity.Student;

public class StudentRepo extends AbstractRepo<Student> {

	@Override
	public Student findByID(long id) {
		Student result = null;
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Student WHERE id=:id AND deletedDateTime IS null");
		query.setParameter("id", id);
		List list = query.list();
		if (list != null && list.size() > 0) {
			result = (Student) query.list().get(0);
		}
		session.close();
		return result;
	}

	@Override
	public List<Student> findAll() {
		List<Student> result = null;
		Session session = sessionFactory.openSession();
		result = session.createQuery("FROM Student WHERE deletedDateTime IS null").list();
		session.close();
		return result;
	}

}
