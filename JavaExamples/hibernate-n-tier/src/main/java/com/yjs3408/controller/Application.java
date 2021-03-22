package com.yjs3408.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.yjs3408.model.DBContext;
import com.yjs3408.model.entity.Student;
import com.yjs3408.view.MainFrame;

public class Application {
	
	private MainFrame mainFrame = new MainFrame();
	private DBContext dbContext = DBContext.getInstance();

	public void start() {
		mainFrame.addSaveButtonListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Student student = new Student();
				student.setFirstName(mainFrame.getFirstName());
				student.setLastName(mainFrame.getLastName());
				dbContext.getStudents().save(student);
			}
		});
		mainFrame.setVisible(true);
	}

}
