package com.yjs3408.model;

import com.yjs3408.model.repository.CourseRepo;
import com.yjs3408.model.repository.StudentRepo;

public final class DBContext {

	private static final DBContext INSTANCE = new DBContext();
	
	private final StudentRepo students = new StudentRepo();
	private final CourseRepo courses = new CourseRepo();
	
	public static DBContext getInstance() {
		return INSTANCE;
	}
	
	public StudentRepo getStudents() {
		return students;
	}
	
	public CourseRepo getCourses() {
		return courses;
	}
	
}
