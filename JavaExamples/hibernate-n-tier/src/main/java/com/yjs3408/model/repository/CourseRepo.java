package com.yjs3408.model.repository;

import java.util.List;

import org.hibernate.Session;

import com.yjs3408.model.entity.Course;

public class CourseRepo extends AbstractRepo<Course>{

	@Override
	public Course findByID(long id) {
		Course result = null;
		Session session = sessionFactory.openSession();
		result = session.get(Course.class, id);
		session.close();
		return result;
	}

	@Override
	public List<Course> findAll() {
		List<Course> result = null;
		Session session = sessionFactory.openSession();
		result = session.createQuery("FROM Course WHERE deletedDateTime IS null").list();
		session.close();
		return result;
	}

}
