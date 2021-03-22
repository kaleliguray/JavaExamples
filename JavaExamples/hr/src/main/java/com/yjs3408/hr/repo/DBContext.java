package com.yjs3408.hr.repo;

public final class DBContext {

	private static DBContext INSTANCE;

	private DepartmentRepo departmentRepo;
	private EmployeeRepo employeeRepo;

	private DBContext() {
	}

	public static DBContext getInstance() {
		if (INSTANCE == null) INSTANCE = new DBContext();
		return INSTANCE;
	}

	public DepartmentRepo getDepartmentRepo() {
		if (departmentRepo == null) departmentRepo = new DepartmentRepo();
		return departmentRepo;
	}

	public EmployeeRepo getEmployeeRepo() {
		if (employeeRepo == null) employeeRepo = new EmployeeRepo();
		return employeeRepo;
	}

}
