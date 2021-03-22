package com.yjs3408.hr;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.yjs3408.hr.repo.DBContext;
import com.yjs3408.hr.repo.domain.Department;

public class Driver {

	public static void main(String[] args) {
		List<Department> departments = new ArrayList<>();
		departments.add(new Department() {
			{
				setName("IT");
			}
		});
		departments.add(new Department() {
			{
				setName("Finans");
			}
		});
		departments.add(new Department() {
			{
				setName("Muhasebe");
			}
		});
		
		DBContext.getInstance().getDepartmentRepo().saveAll(departments);
		
		
		
//		List<Department> departments = DBContext.getInstance().getDepartmentRepo().findAll();
//		for (Department department : departments) {
//			System.out.println(department);
//		}

//		Department department = DBContext.getInstance().getDepartmentRepo().findById(3);
//		System.out.println(department);

//		department.setName("Operations");
//		boolean success = DBContext.getInstance().getDepartmentRepo().update(department);
//		System.out.println("Success: " + success);

//		Department department = new Department();
//		department.setName("Elektronik Department 3");
//		System.out.println(department.getId());
////
//		DBContext.getInstance().getDepartmentRepo().save(department);
//		
//		System.out.println(department.getId());
		
//		if (DBContext.getInstance().getDepartmentRepo().delete(8)) {
//			JOptionPane.showMessageDialog(null, "İşlem Başarılı");
//		}
		
//		System.out.println(DBContext.getInstance().getDepartmentRepo().count());
	}
}
