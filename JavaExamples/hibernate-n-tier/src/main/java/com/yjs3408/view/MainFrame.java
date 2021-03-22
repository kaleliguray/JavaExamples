package com.yjs3408.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame {

	private final JFrame frame = new JFrame("Student App");
	
	private JButton btnSave;
	private JTextField txtFirstName;
	private JTextField txtLastName;

	public MainFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			JPanel panel = new JPanel();
			{
				txtFirstName = new JTextField(20);
				panel.add(txtFirstName);
			}
			{
				txtLastName = new JTextField(20);
				panel.add(txtLastName);
			}
			{
				btnSave = new JButton("Save");
				panel.add(btnSave);
			}
			frame.add(panel, BorderLayout.CENTER);
		}
		{
			JTextArea textArea = new JTextArea(10, 10);
			frame.add(textArea, BorderLayout.SOUTH);
		}
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

	public void addSaveButtonListener(ActionListener actionListener) {
		btnSave.addActionListener(actionListener);
	}

	public String getFirstName() {
		return txtFirstName.getText().toUpperCase();
	}

	public String getLastName() {
		return txtLastName.getText().toUpperCase();
	}
}
